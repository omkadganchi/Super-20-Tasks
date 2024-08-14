package for_loops;

public class Sum_of_even_and_odd_1_10 {

	public static void main(String[] args) {

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("Sum of even numbers from 1 to 10: " + evenSum);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println("Sum of odd numbers from 1 to 10: " + oddSum);
	}
}
