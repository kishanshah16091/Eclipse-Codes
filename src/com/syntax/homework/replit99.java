package com.syntax.homework;

import java.util.Scanner;

public class replit99 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		// write your code below
		boolean isPalindrome = true;
		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) != givenString.charAt(givenString.length() - 1 - i)) {
				System.out.println("false");
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("true.");
		}
	}

}
