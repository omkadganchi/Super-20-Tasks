package for_loops;

public class Sum_of_even_1_10 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of 1 to 10 : " + sum);
	}

}
