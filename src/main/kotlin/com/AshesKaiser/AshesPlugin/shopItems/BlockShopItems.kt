package com.AshesKaiser.AshesPlugin.shopItems

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

enum class BlockShopItems(var item: ItemStack, var price: Int){
    STONE(ItemStack(Material.STONE, 1), 20)
}