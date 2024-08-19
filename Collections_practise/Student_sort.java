package Collections_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_sort {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student(1, "Nikhil", 22, 98));
		al.add(new Student(2, "Karan", 21, 88));
		al.add(new Student(3, "Anup", 25, 96));
		al.add(new Student(4, "Nikita", 12, 48));
		al.add(new Student(5, "Shree", 42, 78));
		
		Collections.sort(al);
		System.out.println(al);
	}

}
