package com.tka;

public class FunctionalCalling {

	void m2(operation o) {
		int sum = o.add(10, 20);
		System.out.println(sum);
	}

	public static void main(String[] args) {

		FunctionalCalling obj = new FunctionalCalling();
//		obj.m2(new OperationImpl());

//		obj.m2((num1, num2) -> (num1+num2));
		// OR
		obj.m2((num1, num2) -> (10 + 30));
	}

}