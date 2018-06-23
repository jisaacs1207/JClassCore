package io.jisaacs.ci.jclasscore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

// Commands included in the plugin.


class NoviceActives implements CommandExecutor, Listener {

    private final JClassCore plugin;

    public NoviceActives(JClassCore plugin) {
        this.plugin = plugin; // Store the plugin in situations where you need it.
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args) {
        String cmd = cmnd.getName();
        if (cmd.equalsIgnoreCase("novice")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
            plugin.getServer().broadcastMessage("NoVoot");
            return true;
        } //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }
}
