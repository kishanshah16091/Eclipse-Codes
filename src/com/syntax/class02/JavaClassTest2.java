package com.syntax.class02;

public class JavaClassTest2 {

	public static void main(String[] args) {
		System.out.println("**** TASK A ****");

		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		// Your program should say. “The _______ of 2 numbers ___ and ___ is equal to
		// _____”

		double n1 = 8.99;
		double n2 = 3.99;

		double sum = (n1 + n2);
		double subtract = (n1 - n2);
		double multiply = (n1 * n2);
		double divide = (n1 / n2);

		System.out.println("The " + "sum" + " of 2 number " + n1 + " and " + n2 + " is equal to " + sum);
		System.out.println("The " + "subtract" + " of 2 number " + n1 + " and " + n2 + " is equal to " + subtract);
		System.out.println("The " + "multiply" + " of 2 number " + n1 + " and " + n2 + " is equal to " + multiply);
		System.out.println("The " + "divide" + " of 2 number " + n1 + " and " + n2 + " is equal to " + divide);

		System.out.println("**** TASK B *****");

		// Write a program to find the square of the number 3.9. You program should say
		// “The square of the ____ is ____ ”

		double n3 = (3.9);
		double square;
		square = (n3 * n3);

		System.out.println("The square of the " + n3 + " is " + square);

		System.out.println("**** TASK C ****");

		// Write a program to print the area and perimeter of a rectangle with width = 5
		// and height = 8. Your program should say. “The perimeter of a rectangle with
		// width ___ and height ____ is equal to _____ and the area is __”

		int width = (5);
		int height = (8);
		int perimeter = 2 * (width + height);
		int area = width * height;

		System.out.println("The permeter of a rectangle with width " + width + " and height " + height + " is equal to "
				+ perimeter + " and the area is " + area);
		
	
		
	}

}
