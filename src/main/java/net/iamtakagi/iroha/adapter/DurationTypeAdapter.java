package net.iamtakagi.iroha.adapter;


import net.iamtakagi.iroha.Duration;
import net.iamtakagi.kodaka.adapter.CommandTypeAdapter;
import org.bukkit.command.CommandSender;

import java.util.List;

public class DurationTypeAdapter implements CommandTypeAdapter {

	@Override
	public <T> T convert(String string, Class<T> type) {
		return type.cast(Duration.fromString(string));
	}

	@Override
	public boolean onException(Exception exception, CommandSender sender, String input) {
		return false;
	}

	@Override
	public List<String> onTabComplete(String string) {
		return null;
	}
}

