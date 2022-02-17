package com.syntax.class09;

public class anotherWayArray {

	public static void main(String[] args) {

		// I want to create an array of colors;
		String[] colors = { "blue", "pink", "yellow", "orange" };
		System.out.println("My favorite color is " + colors[2]);

		// possible to do declaration and initialization in 2 steps
		String[] array; // declaring
		array = new String[4];// initializing size

		// Not possible to do declaration and initialization in 2 steps
		// String[] array;
		// array{};

	}

}
