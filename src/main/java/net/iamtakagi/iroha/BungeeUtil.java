package net.iamtakagi.iroha;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class BungeeUtil {

    public static void connect(Plugin plugin, Player player, String serverName) {
        player.sendMessage(Style.AQUA + "Connecting to " + serverName + "...");
        ByteArrayDataOutput output = ByteStreams.newDataOutput();
        output.writeUTF("Connect");
        output.writeUTF(serverName);
        player.sendPluginMessage(plugin, "BungeeCord", output.toByteArray());
    }

    public static void sendAll(Plugin plugin, String serverName) {
        ByteArrayDataOutput output = ByteStreams.newDataOutput();
        output.writeUTF("Connect");
        output.writeUTF(serverName);

        for (Player player : plugin.getServer().getOnlinePlayers()) {
            player.sendMessage(Style.AQUA + "Connecting to " + serverName + "...");
            player.sendPluginMessage(plugin, "BungeeCord", output.toByteArray());
        }
    }

}
