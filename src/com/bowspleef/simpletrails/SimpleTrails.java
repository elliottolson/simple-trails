package com.bowspleef.simpletrails;

import org.bukkit.plugin.java.JavaPlugin;

public class SimpleTrails extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Simple Trails is Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Simple Trails is Disabled!");
    }

}
