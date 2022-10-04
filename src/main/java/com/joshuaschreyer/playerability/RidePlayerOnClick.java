package com.joshuaschreyer.playerability;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class RidePlayerOnClick implements Listener {
    @EventHandler
    public void onPlayerClick(PlayerInteractEntityEvent e) {
        if (Bukkit.getPlayer(e.getRightClicked().getUniqueId()) != null) {
            Bukkit.getPlayer(e.getRightClicked().getName()).addPassenger(Bukkit.getEntity(e.getPlayer().getUniqueId()));
        }
    }
}
