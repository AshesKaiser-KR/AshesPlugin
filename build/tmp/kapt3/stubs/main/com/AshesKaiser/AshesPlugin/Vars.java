package com.AshesKaiser.AshesPlugin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/AshesKaiser/AshesPlugin/Vars;", "", "()V", "mainShop", "Lorg/bukkit/inventory/Inventory;", "getMainShop", "()Lorg/bukkit/inventory/Inventory;", "setMainShop", "(Lorg/bukkit/inventory/Inventory;)V", "money", "Ljava/util/HashMap;", "Lorg/bukkit/entity/Player;", "", "getMoney", "()Ljava/util/HashMap;", "money$delegate", "Lkotlin/Lazy;", "toolShop", "getToolShop", "setToolShop", "AshesPlugin"})
public final class Vars {
    @org.jetbrains.annotations.NotNull()
    public static final com.AshesKaiser.AshesPlugin.Vars INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy money$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static org.bukkit.inventory.Inventory mainShop;
    @org.jetbrains.annotations.NotNull()
    private static org.bukkit.inventory.Inventory toolShop;
    
    private Vars() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<org.bukkit.entity.Player, java.lang.Integer> getMoney() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.Inventory getMainShop() {
        return null;
    }
    
    public final void setMainShop(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.Inventory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.Inventory getToolShop() {
        return null;
    }
    
    public final void setToolShop(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.Inventory p0) {
    }
}