package control_stmt;

import java.util.Scanner;

public class Max_from_Two_Num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int b = sc.nextInt();
		
		
		if(a>b) {
			System.out.println(a+" is maximum");
		} else if(a<b) {
			System.out.println(b+" is maximum");
		} else {
			System.out.println("Both are equal");
		}
	}

}
