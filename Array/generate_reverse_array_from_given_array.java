package Array;

public class generate_reverse_array_from_given_array {

	public static void main(String[] args) {

        int[] a = {11, 22, 33, 44, 55, 66};
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        
        System.out.println("Reversed array:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
	}

}
