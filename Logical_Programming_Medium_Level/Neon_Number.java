package Logical_Programming_Hard_Level;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		isNeonNumber(num);
	}
	
	
	public static void isNeonNumber(int num) {
		int sum = 0;
		int square = num*num;
		
		while(square != 0) {
			int rem = square%10;
		    sum += rem;
		    square = square / 10;
		}
		if(num==sum) {
			System.out.println(num+" is neon number");
		} else {
			System.out.println(num+" is not neon number");
		}
	}

}
