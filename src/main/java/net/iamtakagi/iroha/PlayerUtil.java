package net.iamtakagi.iroha;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerUtil {

    public static void reset(Player player) {
        player.setFireTicks(0);
        player.getInventory().setHeldItemSlot(0);
        player.setHealth(20.0);
        player.setFoodLevel(20);
        player.setSaturation(20);
        player.setMaximumNoDamageTicks(20);
        player.setExp(0);
        player.setLevel(0);
        player.setAllowFlight(false);
        player.setFlying(false);
        player.setGameMode(GameMode.SURVIVAL);
        player.getInventory().setArmorContents(new ItemStack[4]);
        player.getInventory().setContents(new ItemStack[36]);
        player.getActivePotionEffects().forEach(effect -> player.removePotionEffect(effect.getType()));
        player.updateInventory();
    }

    public static int getPotionEffectLevel(Player player, PotionEffectType potionEffectType) {
        for (PotionEffect pe : player.getActivePotionEffects()) {
            if (!pe.getType().getName().equals(potionEffectType.getName())) continue;
            return pe.getAmplifier() + 1;
        }
        return 0;
    }

    public static boolean isFullInventory(Player player) {
        return player.getInventory().firstEmpty() == -1;
    }

    public static void resetWalkSpeed(Player player) {
        player.setWalkSpeed(0.2f);
    }

    public static void resetFlySpeed(Player player) {
        player.setFlySpeed(0.1f);
    }
}
