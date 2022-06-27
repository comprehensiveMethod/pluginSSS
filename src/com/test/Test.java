package com.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
    }
}
