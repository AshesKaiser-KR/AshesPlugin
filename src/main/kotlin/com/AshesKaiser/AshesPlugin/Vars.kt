package com.AshesKaiser.AshesPlugin

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

object Vars {
    val money by lazy { HashMap<Player, Int>() }
    var mainShop: Inventory = Bukkit.createInventory(null, 27, "상점")
    var toolShop: Inventory = Bukkit.createInventory(null, 54, "도구 상점")
}