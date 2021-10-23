package com.AshesKaiser.AshesPlugin

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

object functions {

    fun canBuy(p: Player, price: Int): Boolean {
        if (Vars.money.containsKey(p)){
            return if (Vars.money[p]!! >= price){
                if (p.inventory.firstEmpty() != -1){
                    Vars.money[p] = Vars.money[p]!! - price
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

    fun setShopItem(m: Material, a: Int, enc: List<Enchantment>, lvl: List<Int>, name: String, lore: String): ItemStack{
        val item = ItemStack(m, a)
        for(i in 1..enc.size){
            item.addUnsafeEnchantment(enc[i-1], lvl[i-1])
        }
        val im = item.itemMeta
        im?.setDisplayName(name)
        im?.lore = listOf(lore)
        return item
    }
}