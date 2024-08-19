package Collections_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(05);
		al.add(45);
		al.add(30);
		al.add(92);
		al.add(-65);

		Collections.sort(al);
		System.out.println(al);

	}

}
