package com.syntax.class05;

import java.util.Scanner;

public class calssTest {

	private static String dayname;

	public static void main(String[] args) {
		/*
		 * let's ask user what is today
		 * 
		 * Based on the day let's define which class we have if (Monday or Friday) -->
		 * there is no class today else if (Tuesday or Wednesday) -- > manual else id
		 * (Thursday) else if (Saturday or Sunday) --> java class
		 *
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the day");

		dayname= scan.nextLine();
		if (dayname.equalsIgnoreCase("Monday") || dayname.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class today");
		}

	}

}
