package com.AshesKaiser.AshesPlugin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/AshesKaiser/AshesPlugin/EventListener;", "Lorg/bukkit/event/Listener;", "()V", "onPlayerJoin", "", "e", "Lorg/bukkit/event/player/PlayerJoinEvent;", "playerJoin", "shopSelect", "Lorg/bukkit/event/inventory/InventoryClickEvent;", "toolShopBuy", "slot", "", "buyer", "Lorg/bukkit/entity/HumanEntity;", "AshesPlugin"})
public final class EventListener implements org.bukkit.event.Listener {
    
    public EventListener() {
        super();
    }
    
    @org.bukkit.event.EventHandler()
    public final void onPlayerJoin(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerJoinEvent e) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void shopSelect(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.inventory.InventoryClickEvent e) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void playerJoin(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerJoinEvent e) {
    }
    
    public final void toolShopBuy(int slot, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.HumanEntity buyer) {
    }
}