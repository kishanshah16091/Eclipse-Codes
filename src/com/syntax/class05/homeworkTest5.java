package com.syntax.class05;

import java.util.Scanner;

public class homeworkTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean vote=false;
	

		System.out.print("Please enter your age.");
		int age= input.nextInt();

		if(age==18){
		  System.out.println("You are eligible to vote.");
		}else{
		  System.out.println("You are not eligible to vote.");
		}

}}

