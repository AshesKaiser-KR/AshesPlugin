package com.AshesKaiser.AshesPlugin

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class ShopCommand: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name == "shop" && sender is Player) {
            sender.openInventory(Inventories.mainShop)
            return true
        }else{
            return false
        }
    }
}