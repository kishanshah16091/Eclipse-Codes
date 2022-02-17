package com.syntax.class06;

import java.util.Scanner;

public class switchCaseClassWork {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it.
		 * Once value are capture print which language user speaks.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your country please: ");
		
		String country = input.nextLine();
		String language;
		
		switch (country) {
		case "Germany":
			language ="Deutsch";
			break;
		case "USA":
			language = "English";
			break;
		case "Japan":
			language = "Japnaies";
			break;
		case "Russia":
			language = "Russian";
			break;

		default:
			language = "unknown";

		}

		System.out.println("In usa speaks "+ language+" language.");
		
		
	}

}
