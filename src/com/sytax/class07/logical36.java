package com.sytax.class07;

import java.util.Scanner;

public class logical36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1 = scan.next();
		String word2 = scan.next();

		System.out.println("Please enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if ((word1 == word2) && (num1 == num2)) {
		
			System.out.println("AND");

		} if ((num1 == num2) || (word1 != word2)) {
			System.out.println("OR");

		
		}if ((num1!=num2) && (word1!= word2)) 

			System.out.println("NONE");

		}

	}
