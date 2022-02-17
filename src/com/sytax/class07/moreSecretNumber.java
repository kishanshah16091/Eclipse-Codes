package com.sytax.class07;

import java.util.Scanner;

public class moreSecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sceretNumber =12 ;
		
		Scanner in=new Scanner(System.in);
		int guessNumber;
		do { 
			System.out.println("Please enter a number to win");
			
			guessNumber=in.nextInt();
			
		}while (guessNumber!=sceretNumber);
		
		guessNumber=in.nextInt();
		
	}
	System.out.println("Congratulations");	
		
}

