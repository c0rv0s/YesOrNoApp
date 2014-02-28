package com.example.yesorno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class MessageContent {

	/**
	 * An array of sample (Message) items.
	 */
	public static List<MessageItem> ITEMS = new ArrayList<MessageItem>();

	/**
	 * A map of sample (Message) items, by ID.
	 */
	public static Map<String, MessageItem> ITEM_MAP = new HashMap<String, MessageItem>();

	static {
		// Add 3 sample items.
		addItem(new MessageItem("1", "Item 123456fndegrjeqgjkrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkekrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkedkrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkedkrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkedkrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkedkrebgjkbrjklagbjkrebqgjkbrajkgfjrehngbjurfeanhsgbjkrnejkqwlgnfjkdlsbgvjkfrl5ebgjkfrlbedsbgjkvbfdskjlgbfjkedd7", 3, 5));
		addItem(new MessageItem("2", "Item 2", 0 , 0));
		addItem(new MessageItem("3", "Item 3", 13, 25));
		addItem(new MessageItem("4", "Item 3", 13, 25));
		addItem(new MessageItem("5", "Item 3", 13, 25));
		addItem(new MessageItem("6", "Item 3", 13, 25));
		addItem(new MessageItem("7", "Item 3", 13, 25));
		addItem(new MessageItem("8", "Item 3", 13, 25));
		addItem(new MessageItem("9", "Item 3", 13, 25));
		addItem(new MessageItem("10", "Item 3", 13, 25));
		addItem(new MessageItem("11", "Item 3", 13, 25));
		addItem(new MessageItem("12", "Item 3", 13, 25));
		addItem(new MessageItem("13", "Item 3", 13, 25));
		addItem(new MessageItem("14", "Item 3", 13, 25));
		addItem(new MessageItem("15", "Item 3", 13, 25));
		addItem(new MessageItem("16", "Item 3", 13, 25));
		addItem(new MessageItem("17", "Item 3", 13, 25));
		addItem(new MessageItem("18", "Item 3", 13, 25));
		addItem(new MessageItem("19", "Item 3", 13, 25));
	}

	private static void addItem(MessageItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A Message item representing a piece of content.
	 */
	public static class MessageItem {
		private String id;
		private String content;
		private int yesScore;
		private int noScore;
		
		public String getTitle() {
			if (content.length() <= 8)
				return content;
			else
				return content.substring(0, 7) + "...";
		}
		
		public String getID() {
			return id;
		}
		
		public String getContent() {
			return content;
		}
		
		public int yesScore() {
			return yesScore;
		}
		
		public int noScore() {
			return noScore;
		}

/*		public MessageItem() {
			this.content = "";
			this.id = content;
			this.yesScore = 0;
			this.noScore = 0;
		}*/
		
		public MessageItem(String id, String content, int yesScore, int noScore) {
			this.id = id;
			this.content = content;
			this.yesScore = yesScore;
			this.noScore = noScore;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
