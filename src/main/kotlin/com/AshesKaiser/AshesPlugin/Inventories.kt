package com.AshesKaiser.AshesPlugin

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

object Inventories {
    // Define Shops
    var mainShop: Inventory = Bukkit.createInventory(null, 27, "상점")
    var toolShop: Inventory = Bukkit.createInventory(null, 54, "도구 상점")

    //상점에 아이템 진열

}