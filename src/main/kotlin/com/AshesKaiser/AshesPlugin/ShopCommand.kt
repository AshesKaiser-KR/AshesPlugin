package com.AshesKaiser.AshesPlugin

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player


class ShopCommand: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            return if (command.name == "shop") {
                sender.openInventory(Inventories.mainShop)
                true
            }else if (command.name == "money"){
                if (Vars.money.containsKey(sender)){
                    Vars.money[sender] = args[1].toInt()
                    true
                }else{
                    Vars.money.put(sender, args[1].toInt())
                    true
                }
            }else{
                false
            }
        }else{
            return false
        }
    }
}