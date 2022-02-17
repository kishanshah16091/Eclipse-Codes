package com.sytax.class07;

import java.util.Scanner;

public class homeWorkClass06 {

	public static void main(String[] args) {
		
		//using scanner class create calculator 
		
	
		
		Scanner sc;
		char operator;
		 sc =new Scanner(System.in);
		 Scanner input = new Scanner(System.in);

			System.out.println("Please enter 2 numbers:");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			System.out.println("Please enter one of these operator: +, -, *, / ");
			String operator = input.next();

			int result;

			if (operator=='+') {
				result = num1 + num2;
			} else if (operator=='-') {
				result = num1 - num2;
			} else if (operator=='*') {
				result = num1 * num2;
			} else if (operator.equals('/')) {
				result = num1 / num2;
			} else {
				System.out.println("Invalid entry");
			}

			System.out.println("The result is " + result);
		
		 
		 
		 
		 
		 
		 
		
	}

}
