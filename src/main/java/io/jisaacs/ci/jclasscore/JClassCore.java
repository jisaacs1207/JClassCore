package io.jisaacs.ci.jclasscore;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JClassCore extends JavaPlugin implements Listener {
    public static JClassCore plugin;

    @Override
    public void onEnable() {
        plugin = this;
        registerEvents(this, new Novice(this),
                new Utility(this), new AdminCommands(this),
                new PlayerCommands(this), new NoviceActives(this),
                new NovicePassives(this));
        getCommand("jclass").setExecutor(new AdminCommands(this));
        getCommand("jc").setExecutor(new AdminCommands(this));
        getCommand("class").setExecutor(new PlayerCommands(this));
        getCommand("cl").setExecutor(new PlayerCommands(this));
        getCommand("novice").setExecutor(new NoviceActives(this));
        getCommand("nov").setExecutor(new NoviceActives(this));
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
