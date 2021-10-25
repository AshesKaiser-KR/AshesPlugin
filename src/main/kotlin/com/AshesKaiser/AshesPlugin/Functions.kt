package com.AshesKaiser.AshesPlugin

import org.bukkit.entity.Player

object Functions {

    fun canBuy(p: Player, price: Int): Boolean {
        if (Vars.money.containsKey(p)){
            return if (Vars.money[p]!! >= price){
                if (p.inventory.firstEmpty() != -1){
                    true
                }else{
                    p.sendMessage("인벤토리에 공간이 없습니다!")
                    false
                }
            }else{
                p.sendMessage("돈이 부족합니다!")
                false
            }
        }
        return false
    }
}