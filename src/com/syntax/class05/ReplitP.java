package com.syntax.class05;

import java.util.Scanner;

public class ReplitP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean gender;
		
		System.out.println("Please enter your gender");
		boolean gender1 =in.nextBoolean();

		System.out.println("Please enter your age");
		int age = in.nextInt();
		if (gender==true) && (age > 25) {
			System.out.println("Woman");

		} else if (age==25) {

			System.out.println("Man");
		} if (age<25) {
			
		System.out.println("Girl");
			
		}else if (age<=24) {
	System.out.println("boy");
		
		}
}
}