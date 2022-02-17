package com.sytax.class07;

import java.util.Scanner;

public class nest32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);

		
    
		System.out.println("Please enter your gender");
		char gender = in.next().charAt(0);

		System.out.println("Please enter your age");
		int age = in.nextInt();
		if ((gender=='f') && age > 25) {
			System.out.println("Woman");

		}else ((gender =='m') && (age < 25)) {

		System.out.println("Man");
		} if (age<25) {
			
		System.out.println("Girl");
			
		}else if (age<=25) {
	System.out.println("boy");
		
	}
	}
	}
