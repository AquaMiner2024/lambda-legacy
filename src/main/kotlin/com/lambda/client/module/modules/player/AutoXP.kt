package com.lambda.client.module.modules.player

import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.client.util.items.*
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

object AutoXP : Module(
    name = "AutoXP",
    description = "Auto click armor durability and using xp to fix",
    category = Category.PLAYER
) {
    private val threshold by setting("Threshold%", 50, 1..99, 1)

    init {
        safeListener<net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent> {
            val armorSlots = listOf(
                EntityEquipmentSlot.HEAD,
                EntityEquipmentSlot.CHEST,
                EntityEquipmentSlot.LEGS,
                EntityEquipmentSlot.FEET,
            )
            val needsRepair = armorSlots.any { slot ->
                val stack = player.getItemStackFromSlot(slot)
                if (!stack.isEmpty && stack.isItemStackDamageable) {
                    val damagePercent = (stack.maxDamage - stack.itemDamage).toFloat() / stack.maxDamage.toFloat() * 100f
                    damagePercent < threshold && EnchantmentHelper.getEnchantmentLevel(Enchantments.MENDING,stack) > 0
                } else {
                    false
                }
            }
            if (needsRepair) {
                val hotbarSlot = player.hotbarSlots.firstItem(Items.EXPERIENCE_BOTTLE)
                if (hotbarSlot != null) {
                    swapToSlot(hotbarSlot)
                    connection.sendPacket(CPacketPlayer.Rotation(player.rotationYaw, 90f, player.onGround))
                    connection.sendPacket(CPacketPlayerTryUseItem(EnumHand.MAIN_HAND))
                } else {
                    val storageSlot = player.storageSlots.firstItem(Items.EXPERIENCE_BOTTLE)
                    storageSlot?.let {
                        moveToHotbar(this@AutoXP, it) { slotStack ->
                            val item = slotStack.item
                            item !is ItemTool && item !is ItemBlock
                        }
                    }
                }
            }
        }
    }
}