package com.example.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class ShEPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ShEPlugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("ShEPlugin has been disabled.");
    }
}
