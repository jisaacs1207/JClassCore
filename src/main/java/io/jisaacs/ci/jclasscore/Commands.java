package io.jisaacs.ci.jclasscore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

// Commands included in the plugin.

class Commands implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmnd, String string, String[] args) {
        String cmd = cmnd.getName();
        Player player = (Player) sender;
        if ((cmd.equalsIgnoreCase("jclass"))||(cmd.equalsIgnoreCase("jc"))) {
            if((player.hasPermission("jclass.admin"))||(player.isOp())) {
                if (args.length == 0) {
                    player.sendMessage("JClassCore");
                }
            }
            else player.sendMessage("You do not have permission to do that.");
        }
        return false;
    }
}