package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.Functions.canBuy
import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerJoinEvent

class EventListener: Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent){
        if (!Vars.money.containsKey(e.player)){
            Vars.money[e.player] = 0
        }
    }
    @EventHandler
    fun shopSelect(e: InventoryClickEvent) {
        if (e.view.title == "상점") {
            when (e.rawSlot) {
                10 -> e.whoClicked.openInventory(Vars.toolShop)
            }
        } else if (e.view.title == "도구 상점") {
            if (e.click == ClickType.LEFT){
                when (e.rawSlot){
                    10 -> {
                        if (canBuy(e.whoClicked as Player, ToolShopItems.LOGGER_AXE.price)){
                            Vars.money[e.whoClicked as Player] = Vars.money[e.whoClicked]!! - ToolShopItems.LOGGER_AXE.price
                        }
                    }
                }
            }
        }
    }
}