package com.AshesKaiser.AshesPlugin

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

class EventListener: Listener {
    @EventHandler
    fun shopSelect(e: InventoryClickEvent) {
        if (e.view.title == "상점") {
            when (e.rawSlot) {
                10 -> e.whoClicked.openInventory(Inventories.toolShop)
            }
        }else if (e.view.title == "도구 상점") {
            when (e.rawSlot) {
                1 -> e.whoClicked.inventory.addItem(ItemStack(Material.WOODEN_PICKAXE, 1))
                10 -> e.whoClicked.inventory.addItem(ItemStack(Material.STONE_PICKAXE, 1))
                19 -> e.whoClicked.inventory.addItem(ItemStack(Material.IRON_PICKAXE, 1))
                28 -> e.whoClicked.inventory.addItem(ItemStack(Material.GOLDEN_PICKAXE, 1))
                37 -> e.whoClicked.inventory.addItem(ItemStack(Material.DIAMOND_PICKAXE, 1))
                46 -> e.whoClicked.inventory.addItem(ItemStack(Material.NETHERITE_PICKAXE, 1))
            }
        }
    }
}