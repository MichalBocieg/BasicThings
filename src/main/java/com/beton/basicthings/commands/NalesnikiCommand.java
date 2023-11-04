package com.beton.basicthings.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NalesnikiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage("§4§l---------------------------------------------");
            player.sendMessage(" §8§lSKLADNIGGI");
            player.sendMessage("§4| §71 szklanka mlek");
            player.sendMessage("§4| §72 jajka");
            player.sendMessage("§4| §71 szklanka monki §6§lWiNtOn");
            player.sendMessage("§4| §73/4 szklanki wody gazowanej");
            player.sendMessage("§4| §73 lyzki oleju");
            player.sendMessage("§4| §7szczypta soli");
            player.sendMessage("§4| §62mg opium");
            player.sendMessage(" §8§lPRZYGOTOWANIE");
            player.sendMessage("§4| §7wymieszac i wlac na patelnie");
            player.sendMessage("§4§l---------------------------------------------");
        }
        return false;
    }
}
