package com.AshesKaiser.AshesPlugin

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        logger.info("플러그인 활성화")
        Bukkit.getPluginManager().registerEvents(EventListener(), this)

        getCommand("shop")?.setExecutor(ShopCommand())

        //상점에 아이템 진열
        Inventories.mainShop.setItem(10, ItemStack(Material.DIAMOND_PICKAXE, 1))

        //도구 상점에 아이템 진열
        Inventories.toolShop.setItem(1, ItemStack(Material.WOODEN_PICKAXE, 1))
        Inventories.toolShop.setItem(10, ItemStack(Material.STONE_PICKAXE, 1))
        Inventories.toolShop.setItem(19, ItemStack(Material.IRON_PICKAXE, 1))
        Inventories.toolShop.setItem(28, ItemStack(Material.DIAMOND_PICKAXE, 1))
        Inventories.toolShop.setItem(37, ItemStack(Material.NETHERITE_PICKAXE, 1))
        Inventories.toolShop.setItem(46, ItemStack(Material.WOODEN_PICKAXE, 1))
    }

    override fun onDisable() {
        logger.info("플러그인 비활성화")
    }
}