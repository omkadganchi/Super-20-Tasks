package control_stmt;

public class zero_positive_negative {

	public static void main(String[] args) {

		int a = 10;
		
		if(a>0) {
			System.out.println(a+" is positive");
		} else if(a<0) {
			System.out.println(a+" is negative");
		} else {
			System.out.println(a+" is neither +ve nor -ve");
		}
	}

}
