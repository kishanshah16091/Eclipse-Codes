package com.syntax.class4;

import java.util.Scanner;// we need to import scanner in to our class

// Window Ctrl+shif+o --> auto input 
// Mac Cmd+shift+o

public class scannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// creating a scanner
		System.out.println("please enter your name");
		// if you want capture single string --> use next();

		String name = input.next();
		System.out.println("you name is " + name);

//if you want to capture int -- > use nextInt();

		System.out.println(name + " please enter your age");
		int age = input.nextInt();// type integer and hit enter

		System.out.println("Your name is " + name + " and your age is " + age);

		String country = input.next();
		System.out.println("I am from " + country);

		if (country.equals("USA")) {
			System.out.println("You speak english");

		} else if (country.equals("Franch")) {
			System.out.println("You speak frech");
		} else if (country.equals("Turky")) {
			System.out.println(" you speack Tyrkish");
		} else {
			System.out.println("I don't know which --Error");
		}

	}

}
