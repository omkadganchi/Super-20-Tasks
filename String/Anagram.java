package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Race";// acer
		String s2 = "Care";//acer
		
		if(s1.length() == s2.length()){
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean result = Arrays.equals(ch1, ch2);
			
			if(result) {
				System.out.println(s1+" and "+s2+" are anagram.");
			} else {
				System.out.println(s1+" and "+s2+" are not anagram.");
			}
		} else {
			System.out.println(s1+" and "+s2+" are not anagram.");
		}
	}
}
