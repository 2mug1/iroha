package net.iamtakagi.iroha.adapter;

import net.iamtakagi.iroha.Style;
import net.iamtakagi.kodaka.adapter.CommandTypeAdapter;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class ChatColorTypeAdapter implements CommandTypeAdapter {

	@Override
	public <T> T convert(String string, Class<T> type) {
		return type.cast(Style.getColorFromName(string));
	}

	@Override
	public boolean onException(Exception exception, CommandSender sender, String input) {
		return false;
	}

	@Override
	public List<String> onTabComplete(String string) {
		final String compare = string.trim().toLowerCase();

		List<String> completed = new ArrayList<>();

		for (String colorName : Style.getColorNames()) {
			if (colorName.startsWith(compare)) {
				completed.add(colorName);
			}
		}

		return completed;
	}
}
