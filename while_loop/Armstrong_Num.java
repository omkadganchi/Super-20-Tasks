package while_loop;

public class Armstrong_Num {

	public static void main(String[] args) {

		int num = 370;
		int originalNum = num;
		int sum = 0;
		int powVal = String.valueOf(num).length();

		while (num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem, powVal);
			num = num / 10;
		}
		if (sum == originalNum) {
			System.out.println(originalNum + " is armstrong number");
		} else {
			System.out.println(originalNum + " is not armstrong number");
		}
	}
}