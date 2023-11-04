package com.beton.basicthings;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class NvCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            PotionEffect hasNightVision = player.getPotionEffect(PotionEffectType.NIGHT_VISION);
            PotionEffect aplliedNightVision = new PotionEffect(PotionEffectType.NIGHT_VISION, -1, 0);
            if (args.length == 0) {
                if (hasNightVision != null) {
                    if (hasNightVision.isInfinite()) {
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        player.sendMessage("§4[BT] §6nocne widzenie §c§lOFF");
                    } else if (!hasNightVision.isInfinite()) {
                        player.sendMessage("§4[BT] §6posiadasz juz efekt nocnego widzenia nienadany z komendy");
                    }
                } else {
                    player.addPotionEffect(aplliedNightVision);
                    player.sendMessage("§4[BT] §6nocne widzenie §a§lON");
                }
            } else if (args.length == 1) {
                if (args[0].equals("off") || args[0].equals("wylacz")) {
                    if (hasNightVision != null) {
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        player.sendMessage("§4[BT] §6nocne widzenie §c§lOFF");
                    } else {
                        player.sendMessage("§4[BT] §6nocne widzenie nie jest wlaczone");
                    }
                } else if (args[0].equals("on") || args[0].equals("wlacz")) {
                    if (hasNightVision == null || !hasNightVision.isInfinite()) {
                        player.addPotionEffect(aplliedNightVision);
                        player.sendMessage("§4[BT] §6nocne widzenie §a§lON");
                    } else {
                        player.sendMessage("§4[BT] §6nocne widzenie jest juz wlaczone");
                    }
                }
            }
        }
        return false;
    }

}
