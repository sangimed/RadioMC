package com.mohamedibrihen.radiomc;

import org.bukkit.plugin.java.JavaPlugin;

public class RadioMC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(getDescription().getName() + " has been enabled (V." + getDescription().getVersion() + ")");
    }

    public void onDisable() {
        getLogger().info(getDescription().getName() + " has been disabled (V." + getDescription().getVersion() + ")");

    }
}
