package control_stmt;

import java.util.Scanner;

public class Max_from_Three_Num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int b = sc.nextInt();
		System.out.print("Enter Number 3 : ");
		int c = sc.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println(a+" is maximum");
		} else if(b>a && b>c) {
			System.out.println(b+" is maximum");
		}else if(c>a && c>b) {
			System.out.println(c+" is maximum");
		}  else {
			System.out.println("all are equal");
		}
	}

}
