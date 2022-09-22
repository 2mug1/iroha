package net.iamtakagi.iroha.strapped;

import lombok.Getter;
import org.bukkit.plugin.Plugin;

@Getter
public class Strapped {

	protected final Plugin instance;

	public Strapped(Plugin instance) {
		this.instance = instance;
	}

}
