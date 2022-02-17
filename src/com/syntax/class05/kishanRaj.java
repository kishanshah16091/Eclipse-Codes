package com.syntax.class05;

import java.util.Scanner;

public class kishanRaj {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int width =input.nextInt ();
		int height =input.nextInt ();
		int square = 2 * (width + height);
		int area = width * height;

		System.out.println("Please enter the length");
		System.out.println("Please enter the width");
		System.out.println("The shape of your oblect is rectangle");
	}
}

