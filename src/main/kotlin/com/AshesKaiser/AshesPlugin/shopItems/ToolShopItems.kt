package com.AshesKaiser.AshesPlugin.shopItems

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

enum class ToolShopItems(var item: ItemStack, var price: Int){
    LOGGER_AXE(ItemStack(Material.IRON_AXE, 1).apply{
        addEnchantment(Enchantment.DIG_SPEED, 2)
        addUnsafeEnchantment(Enchantment.DURABILITY, 5)
        itemMeta = itemMeta!!.apply{
            setDisplayName("나무꾼의 도끼")
            lore = listOf("나무꾼이 쓰던 도끼.\n나무꾼의 행운이 서려있을지도?")
        }
    }, 1500)
}

