package simple_programs;

import java.util.Scanner;

public class Sum_of_two_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num 1 : ");
		int a = sc.nextInt();
		System.out.print("enter num 2 : ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("\nTotal Sum is : "+c);
	}

}
