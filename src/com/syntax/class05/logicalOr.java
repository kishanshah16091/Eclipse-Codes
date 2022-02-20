package com.syntax.class05;

import java.util.Scanner;

public class logicalOr {



	public static void main(String[] args) {
		String day="Sunday";
				
				if (day.equals("Saturday") || day.equals("Sunday")) {
					System.out.println("I have java class");
				}
				System.out.println("Code outside of if statement");
				
/*let's ask user what is today
 * 
 * Based on the day let's define which class we have 
 * if (Monday or Friday) --> there is no class today 
 * else if (Tuesday or Wednesday) -- > manual
 * else id (Thursday) 
 *else if (Saturday or Sunday) --> java class
 *
 * 
 */
				Scanner input =new Scanner(System.in);
				System.out.println("please enter the day");
				day= input.nextLine();
				if (day .equals("Monday") || day.equals("Friday")) {
					System.out.println("There is no class today");
				}
				
				
				
	}

}
