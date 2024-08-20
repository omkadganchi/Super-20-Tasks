package Logical_Programming_Hard_Level;

public class Factorial_recursion {

	public static void main(String[] args) {
		Factorial_recursion f1 = new Factorial_recursion();
		int num = 5;
		System.out.println("Factorial of " + num + " is : " + f1.m2(num));
	}

	private int m2(int i) {
		if (i == 1 || i == 0) {
			return 1;
		} else {
			return i * m2(i - 1);
		}
	}

}
