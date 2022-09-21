package net.iamtakagi.iroha;

import lombok.AllArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

@AllArgsConstructor
public class BaseEvent extends Event {
	private Plugin plugin;

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public void call() { plugin.getServer().getPluginManager().callEvent(this); }

}
