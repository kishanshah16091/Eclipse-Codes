package com.syntax.homework;

import java.util.Scanner;

public class replit78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] myArray = new int[5];
		System.out.println("");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = s.nextInt();
			System.out.println(myArray[i] * 10);
		}
	}

}
