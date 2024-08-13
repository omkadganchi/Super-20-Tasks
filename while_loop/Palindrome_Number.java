package while_loop;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num = 121;
		int originalNum = num;
		int rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		if (originalNum == rev) {
			System.out.println(originalNum + " is palindrome number");
		} else {
			System.out.println(originalNum + " is not palindrome number");
		}
	}
}