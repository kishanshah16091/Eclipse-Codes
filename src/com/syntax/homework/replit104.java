package com.syntax.homework;

import java.util.Scanner;

public class replit104 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			names[i] = scan.nextLine();
		}
			for (String name : names) {
				System.out.println(name.substring(0, 3));
			}
		}
	}

