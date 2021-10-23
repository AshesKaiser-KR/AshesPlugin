package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(), CommandExecutor{
    override fun onEnable() {
        logger.info("플러그인 활성화")
        Bukkit.getPluginManager().registerEvents(EventListener(), this)

        //상점에 아이템 진열
        Inventories.mainShop.setItem(10, ItemStack(Material.DIAMOND_PICKAXE, 1))

        //도구 상점에 아이템 진열
        Inventories.toolShop.setItem(10, ToolShopItems.shopItems[0])
    }

    override fun onDisable() {
        logger.info("플러그인 비활성화")
    }

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