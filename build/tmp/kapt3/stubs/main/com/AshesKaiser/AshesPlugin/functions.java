package com.AshesKaiser.AshesPlugin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/AshesKaiser/AshesPlugin/functions;", "", "()V", "canBuy", "", "p", "Lorg/bukkit/entity/Player;", "price", "", "setShopItem", "Lorg/bukkit/inventory/ItemStack;", "m", "Lorg/bukkit/Material;", "a", "enc", "", "Lorg/bukkit/enchantments/Enchantment;", "lvl", "name", "", "lore", "AshesPlugin"})
public final class functions {
    @org.jetbrains.annotations.NotNull()
    public static final com.AshesKaiser.AshesPlugin.functions INSTANCE = null;
    
    private functions() {
        super();
    }
    
    public final boolean canBuy(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player p, int price) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack setShopItem(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material m, int a, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.bukkit.enchantments.Enchantment> enc, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> lvl, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String lore) {
        return null;
    }
}