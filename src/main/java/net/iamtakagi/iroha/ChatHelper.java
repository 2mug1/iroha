package net.iamtakagi.iroha;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

public class ChatHelper {

	public static ClickEvent click(String command) {
		return new ClickEvent(ClickEvent.Action.RUN_COMMAND, command);
	}

	public static ClickEvent suggest(String command) {
		return new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, command);
	}

	public static HoverEvent hover(String text) {
		return new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(text).create());
	}

	public static String getProgressBar(int current, int max, int totalBars, String symbol, String completedColor, String notCompletedColor){
		float percent = (float) current / max;
		int progressBars = (int) ((int) totalBars * percent);
		int leftOver = (totalBars - progressBars);

		StringBuilder sb = new StringBuilder();
		sb.append(Style.translate(completedColor));
		for (int i = 0; i < progressBars; i++) {
			sb.append(symbol);
		}
		sb.append(Style.translate(notCompletedColor));
		for (int i = 0; i < leftOver; i++) {
			sb.append(symbol);
		}
		return sb.toString();
	}

}
