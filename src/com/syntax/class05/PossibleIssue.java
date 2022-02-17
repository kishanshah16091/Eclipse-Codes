package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
	
		//next() vs nextLine();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=scan.next();
		System.out.println(name);
		
		System.out.println("Please enter you age");
		int age=scan.nextLint();
		

	}

}
