package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.functions.canBuy
import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems

import org.bukkit.entity.HumanEntity
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerJoinEvent

class EventListener: Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent){
        Vars.money[e.player] = 0
    }
    @EventHandler
    fun shopSelect(e: InventoryClickEvent) {
        if (e.view.title == "상점") {
            when (e.rawSlot) {
                10 -> e.whoClicked.openInventory(Vars.toolShop)
            }
        }else if (e.view.title == "도구 상점") {
            if (e.click == ClickType.LEFT){
                toolShopBuy(e.rawSlot, e.whoClicked)
            }
        }
    }

    @EventHandler
    fun playerJoin(e: PlayerJoinEvent){
        Vars.money[e.player] = 0
    }

    fun toolShopBuy(slot: Int, buyer: HumanEntity){
        var boughtItem: ToolShopItems? = null
        when (slot){
            10 -> boughtItem = ToolShopItems.LOGGER_AXE
            else -> null
        }
        if (boughtItem != null){
            if (canBuy(buyer as Player, boughtItem.price)){
                Vars.money[buyer] = Vars.money[buyer]!! - boughtItem.price
            }
        }
    }



}