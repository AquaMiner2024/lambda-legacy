package com.lambda.client.module.modules.player

import com.lambda.client.event.SafeClientEvent
import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.client.process.PauseProcess.pauseBaritone
import com.lambda.client.process.PauseProcess.unpauseBaritone
import com.lambda.client.util.TickTimer
import com.lambda.client.util.TimeUnit
import com.lambda.client.util.items.*
import com.lambda.client.util.threads.runSafe
import com.lambda.client.util.threads.safeListener
import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.init.Enchantments
import net.minecraft.init.Items
import net.minecraft.inventory.EntityEquipmentSlot
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemTool
import net.minecraft.network.play.client.CPacketPlayer
import net.minecraft.network.play.client.CPacketPlayerTryUseItem
import net.minecraft.util.EnumHand
import net.minecraftforge.fml.common.gameevent.TickEvent

object AutoXP : Module(
    name = "AutoXP",
    description = "Auto click armor durability and using xp to fix",
    category = Category.PLAYER
) {
    private val threshold by setting("Threshold%", 50, 1..99, 1)
    private val packetDelay by setting("Packet Delay", 20, 1..100, 1, description = "Delay between XP bottles")
    private val pauseBaritone by setting("PauseBaritone", true)

    private val repaitTimer = TickTimer(TimeUnit.TICKS)
    private var isRepairing = false
    private var lastSlot = -1
    private var lastPitch = 0f

    override fun isActive(): Boolean {
        return isEnabled && isRepairing
    }

    init {
        onDisable {
            stopRepaiting()
            swapBack()
        }
        safeListener<TickEvent.ClientTickEvent> {
            if (it.phase != TickEvent.Phase.START || !player.isEntityAlive) return@safeListener
            if (needsRepair()) {
                val hotbarSlot = player.hotbarSlots.firstItem(Items.EXPERIENCE_BOTTLE)
                if (hotbarSlot != null) {
                    if (!isRepairing) {
                        lastSlot = player.inventory.currentItem
                        lastPitch = player.rotationPitch
                        startRepairing()
                    }
                    if (repaitTimer.tick(packetDelay)) {
                        swapToSlot(hotbarSlot)
                        connection.sendPacket(CPacketPlayer.Rotation(player.rotationYaw, 90f, player.onGround))
                        connection.sendPacket(CPacketPlayerTryUseItem(EnumHand.MAIN_HAND))
                    }
                } else {
                    val storageSlot = player.storageSlots.firstItem(Items.EXPERIENCE_BOTTLE)
                    storageSlot?.let {
                        moveToHotbar(this@AutoXP, it) { slotStack ->
                            val item = slotStack.item
                            item !is ItemTool && item !is ItemBlock
                        }
                    }
                }
            } else {
                if (isRepairing) {
                    stopRepaiting()
                    swapBack()
                }
            }
        }
    }

    private fun SafeClientEvent.needsRepair(): Boolean {
        val armorSlots = listOf(
            EntityEquipmentSlot.HEAD,
            EntityEquipmentSlot.CHEST,
            EntityEquipmentSlot.LEGS,
            EntityEquipmentSlot.FEET,
        )
        return armorSlots.any { slot ->
            val stack = player.getItemStackFromSlot(slot)
            if (!stack.isEmpty && stack.isItemStackDamageable) {
                val damagePercent = (stack.maxDamage - stack.itemDamage).toFloat() / stack.maxDamage.toFloat() * 100f
                damagePercent < threshold && EnchantmentHelper.getEnchantmentLevel(Enchantments.MENDING,stack) > 0
            } else {
                false
            }
        }
    }

    private fun startRepairing() {
        if (!isRepairing) {
            if (pauseBaritone) pauseBaritone()
            isRepairing = true
        }
    }

    private fun stopRepaiting() {
        if (isRepairing) {
            unpauseBaritone()
            isRepairing = false
        }
    }

    private fun swapBack() {
        runSafe {
            if (lastSlot != -1) {
                swapToSlot(lastSlot)
                lastSlot = -1
            }
            connection.sendPacket(CPacketPlayer.Rotation(player.rotationYaw, lastPitch, player.onGround))
        }
    }
}