package Logical_Programming_Hard_Level;

public class Prime_num_from_array {

    public static void main(String[] args) {

        int a[] = { 5, 4, 3, 7, 8 };

        for (int i = 0; i < a.length; i++) {
            int num = a[i];  
            boolean isPrime = true;

			if (num <= 1) {
				isPrime = false;
			} else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number in the array.");
            }
        }
    }
}
