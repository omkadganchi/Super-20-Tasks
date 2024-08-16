package control_stmt;

public class Positive_or_negative {

	public static void main(String[] args) {

		int a = 10;
		
		if(a>0) {
			System.out.println(a+" is positive number");
		} else if(a<0) {
			System.out.println(a+" is negative number");
		} else {
			System.out.println(a+" is neither positive nor negative");
		}
	}

}
