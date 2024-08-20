package Logical_Programming_Hard_Level;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if (isPerfectNumber(num)) {
			System.out.println(num + " is perfect number");
		} else {
			System.out.println(num + " is not perfect number");
		}
	}

	public static boolean isPerfectNumber(int num) {
		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;

	}

}
