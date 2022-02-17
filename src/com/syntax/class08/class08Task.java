package com.syntax.class08;

import java.util.Scanner;

public class class08Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + "  ");
			}

			System.out.println("________________________");

			// Create a program that will keep asking user to apply for a credit card. As
			// soon you get “yes” from a user program should stop asking.\
			Scanner scan= new Scanner(System.in);
			String answer;
			
			do {
			System.out.println("Would you like to apply a credit card?");
			answer =scan.nextLine();
			}while (!answer.equalsIgnoreCase("yes")) ;
				System.out.println("Congratulatoin");
				break;

			}
		}
	}

