package Logical_Programming_Hard_Level;

import java.util.Scanner;

public class Next_prime_num_of_given_num {

	public static int nextPrime(int a) {
		boolean isPrime = false;

		while (!isPrime) {
			isPrime = true;
			a++;

			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Next Prime Number is: " + a);
			}
		}
		return a;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();

		if (a < 1) {
			System.out.println("Enter valid number");
		} else {
			nextPrime(a);
		}
	}

}
