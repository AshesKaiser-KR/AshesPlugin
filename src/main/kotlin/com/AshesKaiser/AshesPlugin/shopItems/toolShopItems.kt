package com.AshesKaiser.AshesPlugin.shopItems

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

enum class toolShopItems (
    var item: Material, var amount: Int, var ench: List<Enchantment>, var lvl: List<Int>, var itemName: String, var lore: String, var price: Int
        ){
    LOGGER_AXE(Material.IRON_AXE, 1, listOf(Enchantment.DIG_SPEED, Enchantment.LUCK), listOf(2, 2)
        , "나무꾼의 도끼", "캐는 속도가 빠르고 행운이 적용됩니다.", 1500)
}


