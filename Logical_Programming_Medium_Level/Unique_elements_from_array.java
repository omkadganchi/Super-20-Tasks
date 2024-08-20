package Logical_Programming_Hard_Level;

public class Unique_elements_from_array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 4, 5, 6 };
		
		int count;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println(a[i]);
			}
		}

	}
}
