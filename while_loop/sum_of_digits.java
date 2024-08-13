package while_loop;

public class sum_of_digits {

	public static void main(String[] args) {

		int a = 123;
		int num = a;
		int sum = 0;

		while (a > 0) {
			int rem = a % 10;
			sum += rem;
			a = a / 10;
		}
		System.out.println("The sum of the digits of " + num + " is: " + sum);
	}

}
