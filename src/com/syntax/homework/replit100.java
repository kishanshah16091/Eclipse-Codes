package com.syntax.homework;

import java.util.Scanner;

public class replit100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		String reversStr = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversStr = reversStr + s.charAt(i);
		}
		System.out.println(reversStr);
	}

}
