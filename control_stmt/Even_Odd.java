package control_stmt;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		System.out.println();
		
		if(a%2==0) {
			System.out.println(a+" is even number");
		} else {
			System.out.println(a+" is odd number");
		}
	}

}
