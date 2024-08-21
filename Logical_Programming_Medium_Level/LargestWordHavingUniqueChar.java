package Logical_Programming_Medium_Level;

public class LargestWordHavingUniqueChar {

	public static void main(String[] args) {
		String stmt = "India is greatest country";

		String largestWord = largestWordWithUniqueCharacter(stmt);

		System.out.println("Largest word with unique characters: " + largestWord);
	}

	public static String largestWordWithUniqueCharacter(String stmt) {
		String[] words = stmt.split("\\s+");

		String largestWord = "";

		for (String word : words) {
			if (uniqueChar(word) && word.length() > largestWord.length()) {
				largestWord = word;
			}
		}

		return largestWord;
	}

	public static boolean uniqueChar(String word) {
		char[] chars = word.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			int count = 1;

			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
				}
			}

			if (count > 1) {
				return false;
			}
		}

		return true;
	}
}
