package String;

public class vowels_from_string {

	public static void main(String[] args) {

		String s = "The Kiran Academy";
		
		s = s.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.print(c+" ");
			}
		}
	}

}
