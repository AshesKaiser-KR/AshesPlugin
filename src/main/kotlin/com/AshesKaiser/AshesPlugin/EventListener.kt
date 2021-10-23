package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack

class EventListener: Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent){
        Vars.money[e.player] = 0
    }
    @EventHandler
    fun shopSelect(e: InventoryClickEvent) {
        if (e.view.title == "상점") {
            when (e.rawSlot) {
                10 -> e.whoClicked.openInventory(Inventories.toolShop)
            }
        }else if (e.view.title == "도구 상점") {
            var clickedItem: ItemStack? = null
            if (e.rawSlot == 10){
                if (functions.canBuy((e.whoClicked as Player), ToolShopItems.price[0])){
                    e.whoClicked.inventory.addItem(ToolShopItems.shopItems[0])
                }
            }

        }
    }
}