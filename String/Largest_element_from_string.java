package String;

import java.util.HashSet;
import java.util.Set;

public class Reverse_string {

	public static void main(String[] args) {

		String s = "Hello every one good morning have nice day";
		String[] words = s.split(" ");
		String largestElement = words[0];
		Set<String> set = new HashSet<String>();
		
		for (String w : words) {
			if(w.length()>largestElement.length()) {
				largestElement = w;
				set.clear();
				set.add(w);
			} else if(w.length() == largestElement.length()) {
				set.add(w);
			}
		}
		System.out.println(set);
	}
}
