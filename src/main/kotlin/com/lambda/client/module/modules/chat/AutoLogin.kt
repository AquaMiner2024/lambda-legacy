package com.lambda.client.module.modules.chat

import com.lambda.client.LambdaMod
import com.lambda.client.event.events.PacketEvent
import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.client.util.TickTimer
import com.lambda.client.util.TimeUnit
import com.lambda.client.util.items.hotbarSlots
import com.lambda.client.util.items.swapToSlot
import com.lambda.client.util.text.MessageSendHelper
import com.lambda.client.util.threads.defaultScope
import com.lambda.client.util.threads.safeListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.minecraft.client.gui.inventory.GuiChest
import net.minecraft.init.Items
import net.minecraft.inventory.ClickType
import net.minecraft.network.play.client.CPacketPlayerTryUseItem
import net.minecraft.network.play.server.SPacketPlayerPosLook
import net.minecraft.util.EnumHand
import java.io.File

object AutoLogin : Module(
    name = "AutoLogin",
    description = "AutoLogin and join server",
    category = Category.CHAT
) {
    private val sendLoginCommand by setting("Send Login Command", true)
    private val autoJoinXin by setting("Auto Join Xin", true)
    private val joinDelay by setting("Join Delay (ms)", 1000, 500..10000, 100)

    private val timer = TickTimer(TimeUnit.MILLISECONDS)
    private const val FILENAME = "loginCommand_DO_NOT_SEND_TO_ANYONE.txt"

    private var stage = 0
    private var lastNetworkHash = -1

    init {
        LambdaMod.LOG.info("[AutoLogin] Module Loaded")
        onDisable {
            stage = 0
            lastNetworkHash = -1
        }
        safeListener<PacketEvent.Receive> {
            if (it.packet is SPacketPlayerPosLook) {
                val networkManager = mc.connection?.networkManager
                val currentHash = System.identityHashCode(networkManager)
                if (currentHash != lastNetworkHash) {
                    stage = 1
                    lastNetworkHash = currentHash
                    timer.reset()
                    MessageSendHelper.sendChatMessage("[AutoLogin] AutoLogin Start")
                }
            }
        }
        safeListener<net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent> {
            if (stage == 0 || stage == 3 || !timer.tick(joinDelay.toLong())) return@safeListener
            if (stage == 1) {
                if (sendLoginCommand) {
                    val file = File(FILENAME)
                    if (file.exists()) {
                        val command = file.readText().trim()
                        if (command.isNotEmpty()) {
                            player.sendChatMessage(command)
                            MessageSendHelper.sendChatMessage("[AutoLogin] Login command send")
                        }
                    } else {
                        file.writeText("/l your_password")
                        MessageSendHelper.sendChatMessage("[AutoLogin] Create command file, path ${file.absolutePath}")
                    }
                }
                stage = 2
                timer.reset()
                return@safeListener
            }
            if (stage == 2) {
                if (autoJoinXin) {
                    val targetSlot = player.hotbarSlots[2]
                    swapToSlot(targetSlot)
                    if (player.heldItemMainhand.item == Items.COMPASS) {
                        connection.sendPacket(CPacketPlayerTryUseItem(EnumHand.MAIN_HAND))
                        MessageSendHelper.sendChatMessage("[AutoLogin] Try to use Compass")
                    }
                    stage = 3
                    defaultScope.launch {
                        repeat(20) {
                            val gui = mc.currentScreen
                            if (gui is GuiChest && gui.inventorySlots.inventorySlots.size == 45) {
                                delay(500)
                                mc.playerController.windowClick(
                                    gui.inventorySlots.windowId,
                                    4,
                                    0,
                                    ClickType.PICKUP,
                                    mc.player
                                )
                                MessageSendHelper.sendChatMessage("[AutoLogin] Try to click")
                                return@launch
                            }
                            delay(1000)
                        }
                    }
                } else {
                    stage = 3
                }
            }
        }
    }
}