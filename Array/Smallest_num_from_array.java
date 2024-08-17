package Array;

public class Smallest_num_from_array {

	public static void main(String[] args) {

		int a[] = {11, 9, 45, 95, 0, 106, -7, 55};
		
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Smallest Element from Array is : "+smallest);
	}
}