package com.sytax.class14;

public class Task1 {
	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.

	void printLarger(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("number 1 is greater.");
		} else if (num2 > num1) {
			System.out.println("NUmber 2 is greatae.");

		} else {
			System.out.println("Numbers are same.");
		}
	}

	public static void main(String[] args) {

		Task1 object = new Task1();
		object.printLarger(10, 12);
		object.printLarger(12, 10);
		object.printLarger(10, 10);
	}

}
