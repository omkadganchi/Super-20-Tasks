package String;

public class Larger_string_from_two_strings {

	public static void main(String[] args) {

		String s1 = "Akanksha Khedkar";
		String s2 = "Renuka Madhekar";
		
		if(s1.length()>s2.length()) {
			System.out.println(s1);
		} else if(s1.length()<s2.length()){
			System.out.println(s2);
		} else {
			System.out.println(s1+" & "+s2+" are equal");
		}
	}

}
