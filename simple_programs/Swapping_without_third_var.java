package simple_programs;

public class Swapping_without_third_var {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping A :"+a);
		System.out.println("Before Swapping B :"+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("\nAfter Swapping A :"+a);
		System.out.println("After Swapping B :"+b);
	}

}
