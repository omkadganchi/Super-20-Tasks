package while_loop;

public class Reverse_Number {

	public static void main(String[] args) {

		int num = 12345;
		int rev;
		int sum = 0;
		
		while(num>0) {
			int rem = num % 10;
			sum = (sum*10) + rem;
			num = num / 10;
		}
		rev = sum;
		System.out.println("Reverse Numbber is : "+rev);
	}

}
