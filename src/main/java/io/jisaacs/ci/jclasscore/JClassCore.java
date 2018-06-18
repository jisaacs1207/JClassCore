package io.jisaacs.ci.jclasscore;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JClassCore extends JavaPlugin implements Listener {
    public static JClassCore plugin;

    @Override
    public void onEnable() {
        plugin = this;
        registerEvents(this, new Novice(), new Utility(), new Commands());
        getCommand("jclass").setExecutor(new Commands());
        getCommand("jc").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    private static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}
