package while_loop;

public class Count_of_digits_of_number {

	public static void main(String[] args) {

		int a = 1234;
		int number = a;
		int count=0;
		int sum = 0;
		while(a>0) {
			int rem = a % 10;
			sum = sum + rem;
			count++;
			a = a/10;
		}
		System.out.println("Count of "+number+" is : "+count);
	}
}
