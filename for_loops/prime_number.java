package for_loops;

public class prime_number {

	public static void main(String[] args) {

		int a = 20;
		boolean flag = true;
		
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(a+" is prrime number");
		} else {
			System.out.println(a+" is not prime number");
		}
	}

}
