package Array;

public class _Second_duplicate_from_array {

	public static void main(String[] args) {
		
		int a[] = {11, 22, 22, 11, 11, 33, 22, 44, 33, 44, 55, 55};
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && a[i]!=0) {
					a[j]=0;
					count++;
					if(count==2)
						System.out.println("Second duplicate from array : "+a[i]);
						break;
				}
			}
		}
	}
}