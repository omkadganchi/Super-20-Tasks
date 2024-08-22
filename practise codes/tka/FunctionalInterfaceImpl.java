package com.tka;

@FunctionalInterface
interface operation {
	int add(int num1, int num2);
}

class OperationImpl implements operation {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

}
