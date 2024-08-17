package Array;

public class Count_Occurance_of_array {

	public static void main(String[] args) {

		int a[] = { 11, 22, 22, 11, 11, 33 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = 0;
				}
			}
			if (a[i] != 0) 
				System.out.println(a[i] +" : "+ count);
		}
	}

}
