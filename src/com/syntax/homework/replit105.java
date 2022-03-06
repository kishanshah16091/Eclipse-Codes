package com.syntax.homework;

import java.util.Scanner;

public class replit105 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below
		word = word.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(word);
	}
}