package com.beton.basicthings;

import com.beton.basicthings.commands.KwiatkiCommand;
import com.beton.basicthings.commands.NalesnikiCommand;
import com.beton.basicthings.commands.NvCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Start pluginu BasicThings ...");
        getCommand("nv").setExecutor(new NvCommand());
        getCommand("kwiatki").setExecutor(new KwiatkiCommand());
        getCommand("nalesniki").setExecutor(new NalesnikiCommand());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
