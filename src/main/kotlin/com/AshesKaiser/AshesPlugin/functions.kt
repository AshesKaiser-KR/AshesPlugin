package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.toolShopItems
import org.bukkit.Material
import org.bukkit.entity.HumanEntity
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

class functions {
    fun setItemStack(m: Material, a: Int): ItemStack {
        return ItemStack(m, a)
    }

    fun openShop(p: Player){
        p.openInventory(Inventories.mainShop)
    }

    fun toolShopBuy(slot: Int, player: HumanEntity) {
        when (slot) {
            10 -> player.inventory.addItem(ItemStack(Material.WOODEN_PICKAXE, 1))
        }
    }
}