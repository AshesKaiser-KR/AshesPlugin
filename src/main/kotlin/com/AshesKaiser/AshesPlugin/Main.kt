package com.AshesKaiser.AshesPlugin

import com.AshesKaiser.AshesPlugin.shopItems.BlockShopItems
import com.AshesKaiser.AshesPlugin.shopItems.ToolShopItems
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(), CommandExecutor {
    override fun onEnable() {
        logger.info("${ChatColor.GREEN}플러그인 활성화")

        //상점에 아이템 진열
        Vars.mainShop.setItem(10, ItemStack(Material.DIAMOND_PICKAXE, 1))

        //도구 상점에 아이템 진열
        Vars.toolShop.setItem(10, ToolShopItems.LOGGER_AXE.item)

        //블럭 상점 아이템 진열
        Vars.blockShop.setItem(10, BlockShopItems.STONE.item)
        Bukkit.getPluginManager().registerEvents(EventListener(), this)
    }

    override fun onDisable() {
        logger.info("${ChatColor.RED}플러그인 비활성화")
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (command.name == "shop") {
                sender.openInventory(Vars.mainShop)
                return true
            } else if (command.name == "money"){
                return if (sender.isOp) {
                    if (Vars.money.containsKey(sender)) {
                        Vars.money[sender] = args[1].toInt()
                        true
                    } else {
                        Vars.money[sender] = args[1].toInt()
                        true
                    }
                }else{
                    sender.sendMessage("이 명령어를 실행할 권한이 없습니다!")
                    false
                }
            }
        } else {
            return false
        }
        return false
    }
}