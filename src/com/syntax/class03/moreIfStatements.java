package com.syntax.class03;

public class moreIfStatements {

	public static void main(String[] args) {

		/*
		 * Define a variable to store a value of day If day is Saturday --> I am having
		 * java class today otherwise -- > I don't know which class I have
		 */
		String day = "friday";
		if (day.equals("saturday")) {
			System.out.println("I am having java class today.");
			System.out.println("I am very Excited.");
		} else {
			System.out.println("I don't know which class I have ");
			System.out.println("maybe today is funday");
		}
		System.out.println("*** Different examples *****");

		String day1 = "saturday";
		if (day1.equals("saturday")) {
			System.out.println("I am having java class today.");
			System.out.println("I am very Excited.");
		} else {
			System.out.println("I don't know which class I have ");
			System.out.println("maybe today is funday");
		}
	}

}
