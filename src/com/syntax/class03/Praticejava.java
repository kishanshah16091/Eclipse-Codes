package com.syntax.class03;

public class Praticejava {

	public static void main(String[] args) {

		String name = "Chen";
		int age = 50;
		int iq = 50;

		System.out.println(name);
		System.out.println(age + (iq));

		String program = "Java";
		String Program1 = "programming language";

		System.out.println(program + " is the #1 " + Program1);

		String a = "syntaxtech";
		String b = ".com";
		System.out.println(a + b);

		float number = 8.2f;
		float multiply;
		multiply = (number * number);
		System.out.println("The multiplication of " + number + " with itself is equal to " + multiply);

		int numberA = 200;
		int numberB = 100;

		System.out.println(numberA + numberB);

		System.out.println(numberA * numberB);
		System.out.println(numberA / numberB);

		byte width = 5;
		byte height = 8;
		int perimeter = 2 * (height + width);
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equals to " + perimeter + " and the area equal to " + area);

		int num1 = 3;
		int num2 = 7;
		int num3 = 5;
		int num4 = 1;
		int add;
		add = (num1 + num2);
		int divide;
		divide = (add / num3);

		System.out.println("The result of arithmetic operations is equal to " + (divide - num4));

		int myNumber;
		myNumber = (myNumber = 1);
		int stepOne;
		stepOne = (myNumber = myNumber * myNumber);

		int stepTwo;
		stepTwo = (stepOne + myNumber);

		int stepThree;
		stepThree = (stepTwo / myNumber);
		int stepFour;
		stepFour = (stepThree + 17);
		int stepFive;
		stepFive = (stepFour - (myNumber = 1));
		int stepSix;
		stepSix = (stepFive / 6);
		System.out.println(stepSix);

		int i = 29;
		int j = 4;

		
	}

}
