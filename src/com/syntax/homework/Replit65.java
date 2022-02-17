package com.syntax.homework;

import java.util.Scanner;

public class Replit65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int i = input.nextInt();
		for (int x; i >= 0; i--) {
			if (i == 7 | i == 12 || i == 20)
				continue;
			System.out.print(i + " ");

		}
	}
}
