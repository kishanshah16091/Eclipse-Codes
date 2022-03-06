
package com.syntax.class13;

public class MethodsDemo3 {

	// int we specify the datatype that method will return
	// squareTheNumber name of the method
	// (int number) parameters of the method
	// return tell java what to return from this method
	int squareTheNumber(int number) {
		return number * number;
	}

	int returnTheSameNumber(int number) {
		return number;
	}

	public static void main(String[] args) {
		MethodsDemo3 obj = new MethodsDemo3();
		int result = obj.squareTheNumber(5);
		System.out.println(result);

	}

}
