package com.sytax.class07;

import java.util.Scanner;

public class doLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		
		/*create a secrete number 
		 * 
		 * we want user to guess our secret number 
		 * 
		 * the moment user guessed my secret number --> my program should stop
		 * otherwise it should continue asking to huess my number 
		 * 
		 */


		
		int sceretNumber =12 ;
		
		Scanner in=new Scanner(System.in);
		int guessNumber;
		do { 
			System.out.println("Please enter a number to win");
			
			guessNumber=in.nextInt();
			
		}while (guessNumber!=sceretNumber);
		
		System.out.println("Congratulations");
		
	}

}
