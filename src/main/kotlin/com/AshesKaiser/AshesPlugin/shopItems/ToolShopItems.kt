package com.AshesKaiser.AshesPlugin.shopItems

import com.AshesKaiser.AshesPlugin.functions
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

object ToolShopItems {

    val shopItems: List<ItemStack> = listOf((functions.setShopItem(Material.IRON_AXE, 1,
        listOf(Enchantment.DIG_SPEED, Enchantment.LUCK), listOf(2, 2),
        "나무꾼의 도끼", "나무꾼이 쓰던 도끼이다. 나무꾼의 행운이 따를지도.")))

    val price: List<Int> = listOf(1500)
}
