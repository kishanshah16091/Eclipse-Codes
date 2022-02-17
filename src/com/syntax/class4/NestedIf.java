package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * Nested if - if inside another if if (boolean condition){
		 * 
		 * Code A;
		 * 
		 * } If (boolean condition){ code B; }
		 */

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("How many doses you have");
			if (dose == 1) {
				System.out.println("you need another shot");
			}

			else {
				System.out.println("You are fully vaccinated");
			}
		} else {
			System.out.println("I do not have any further questions");

		}

		System.out.println("--------------------");

		/*
		 * declare a variable for allergy If we have allergy ---> If you have pollen IF
		 * you have peanuts If you have wheat
		 * 
		 * If no allergy --> you are lucky
		 */

		boolean allergy = true;
		if (allergy) {
			System.out.println("Let's check what allgery you have");
			String allergyType="pollen";
			if (allergyType.equals("pollen")) {
			System.out.println("Please stay at home when tress are blooming. Take med A");
			}else if (allergyType.equals("penauts")) {
				System.out.println("Please do not eat food that contains nuts. Take med B");
			}else if (allergyType.equals("wheat")) {
					System.out.println("Please follow gluteen free diet. Take med C");
				
			
			} else {
			System.out.println("I don't which suggestion to give you'");
		
	
	}
	}}}

