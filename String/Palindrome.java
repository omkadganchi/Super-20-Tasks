package String;

public class Palindrome {

    public static void main(String[] args) {

        String s = "Nayan";
        boolean flag = true;
        
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println(s + ": The given string is a palindrome.");
        } else {
            System.out.println(s + ": The given string is not a palindrome.");
        }
    }
}
