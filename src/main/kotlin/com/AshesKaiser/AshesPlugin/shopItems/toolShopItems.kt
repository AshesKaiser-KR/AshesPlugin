package com.AshesKaiser.AshesPlugin.shopItems

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class toolShopItems {
    var toolShop: HashMap<Int, ItemStack> = HashMap<Int, ItemStack>()

    fun setToolShopItems(){
        toolShop.put(10, ItemStack(Material.WOODEN_PICKAXE, 1))
    }


}