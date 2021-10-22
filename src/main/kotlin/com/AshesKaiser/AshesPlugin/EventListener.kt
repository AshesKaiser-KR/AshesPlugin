package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.toolShopItems
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
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
            var clickedItem: toolShopItems? = null
            clickedItem = when (e.rawSlot) {
                10 -> toolShopItems.LOGGER_AXE
                else -> return
            }

        }
    }

    fun getBoughtItem(bought: toolShopItems){
        var boughtItem: ItemStack = functions.setItemStack(bought.item, bought.amount)
        for (i in 1..bought.ench.size){
            boughtItem.addUnsafeEnchantment(bought.ench[i-1], bought.lvl[i-1])
        }

    }
    fun buyTool(p: Player, item: toolShopItems){
        if (functions.canBuyTool(p, item)){
            Vars.money[p] = Vars.money[p]!! - item.price

        }
    }
}