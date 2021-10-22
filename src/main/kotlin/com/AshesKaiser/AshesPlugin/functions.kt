package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.toolShopItems
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

object functions {
    fun setItemStack(m: Material, a: Int): ItemStack {
        return ItemStack(m, a)
    }

    fun openShop(p: Player){
        p.openInventory(Inventories.mainShop)
    }

    fun canBuyTool(p: Player, item: toolShopItems): Boolean {
        if (Vars.money.containsKey(p)){
            if (Vars.money[p]!! >= item.price){
                if (p.inventory.firstEmpty() != -1){
                    return true
                }else{
                    p.sendMessage("인벤토리에 공간이 없습니다!")
                    return false
                }
            }else{
                p.sendMessage("돈이 부족합니다!")
                return false
            }
        }
        return false
    }
}