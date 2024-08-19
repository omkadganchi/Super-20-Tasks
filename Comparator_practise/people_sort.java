package Collections_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class people_sort {

	public static void main(String[] args) {

List<people> al = new ArrayList<people>();
		
		al.add(new people(1, "Nikhil", 22, 98));
		al.add(new people(2, "Karan", 21, 88));
		al.add(new people(3, "Anup", 25, 96));
		al.add(new people(4, "Nikita", 12, 48));
		al.add(new people(5, "Shree", 42, 78));
	
	
		Collections.sort(al, new Comparator<people>() {
            @Override
            public int compare(people p1, people p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
		
		System.out.println("Sorted by Names:");
		for (people people : al) {
			System.out.println(people);
		}
		
		Collections.sort(al, new Comparator<people>() {

			@Override
			public int compare(people o1, people o2) {
				return Integer.compare(o1.age, o2.age);
			}
		});
		System.out.println("\n\nSorted by Age:");
		for (people people1 : al) {
			System.out.println(people1);
		}
	}
}
