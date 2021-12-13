package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.Functions.canBuy
import com.AshesKaiser.AshesPlugin.shopItems.BlockShopItems
import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems
import jdk.nashorn.internal.ir.Block
import org.bukkit.ChatColor
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
    fun shopBuy(e: InventoryClickEvent) {
        val p = e.whoClicked as Player
        if (e.view.title == "상점") {
            e.isCancelled = true
            when (e.rawSlot) {
                10 -> p.openInventory(Vars.toolShop)
            }
        } else if (e.view.title == "도구 상점") {
            e.isCancelled = true
            if (e.click == ClickType.LEFT){
                when (e.rawSlot){
                    10 -> {
                        if (canBuy(p, ToolShopItems.LOGGER_AXE.price)){
                            Vars.money[p] = Vars.money[p]!! - ToolShopItems.LOGGER_AXE.price
                            p.inventory.addItem(ToolShopItems.LOGGER_AXE.item)
                        }else{
                            p.sendMessage("${ChatColor.RED}돈이 부족합니다!")
                        }
                    }
                }
            }
        } else if (e.view.title == "블럭 상점"){
            e.isCancelled = true
            if (e.click == ClickType.LEFT){
                when (e.rawSlot){
                    10 -> {
                        if (canBuy(p as Player, BlockShopItems.STONE.price)){
                            Vars.money[p] = Vars.money[p]!! - BlockShopItems.STONE.price
                            p.inventory.addItem(BlockShopItems.STONE.item)
                        }else{
                            p.sendMessage("${ChatColor.RED}돈이 부족합니다!")
                        }
                    }
                }
            }
        }
    }
}