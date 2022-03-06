package com.syntax.homework;

public class replit114 {
	int Addition(int num1, int num2) {
		return num1 + num2;
	}

	int Multiplication(int num1, int num2) {
		return num1 * num2;
	}

	int Subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {

		replit114 obj1 = new replit114();
		int n1 = obj1.Addition(10, 20);
		System.out.println("Addition " + n1);

		replit114 obj2 = new replit114();
		int n2 = obj1.Multiplication(10, 3);
		System.out.println("Multiplication " + n2);

		replit114 obj3 = new replit114();
		int n3 = obj1.Subtraction(40, 20);
		System.out.println("Subtraction " + n3);
	}
}
