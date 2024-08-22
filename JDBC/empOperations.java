package JDBC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class empOperations {

	public static void main(String[] args) {

		List<Employees> el = new ArrayList<>();
		
		Employees emp1 = new Employees(1, "Om", 1000);
		Employees emp2 = new Employees(2, "Nikhil", 2000);
		Employees emp3 = new Employees(3, "Ishwar", 3000);
		Employees emp4 = new Employees(4, "Anup", 4000);
		Employees emp5 = new Employees(5, "Aditya", 3000);
		
		el.add(emp1);
		el.add(emp2);
		el.add(emp3);
		el.add(emp4);
		el.add(emp5);
		
		for (Employees employees : el) {
			System.out.println(employees);
		}
		
		 Set<Integer> sal = new HashSet<>();
		 for (Employees employees : el) {
			sal.add(employees.getSal());
		}
		 
		 List<Integer> sortedSal = new ArrayList<>(sal);
		 
		 Collections.sort(sortedSal, Collections.reverseOrder());
		 
		 System.out.println("\nSorted salary:");
		 for (Integer integer : sortedSal) {
			System.out.println(integer);
		}
		 
		 if(sortedSal.size()<2) {
			 System.out.println("There is no more than 1 empolyee for comparison");
		 } else {
			 System.out.println("\nSecond sorted : "+sortedSal.get(1));
		 }
	}
}