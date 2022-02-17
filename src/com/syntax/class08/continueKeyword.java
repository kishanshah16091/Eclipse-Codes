package com.syntax.class08;

public class continueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue; // continue is used some conditions (skip current iteration/cycle)
			}
			System.out.println("Hello " + i);
			System.out.println("we are batch 12");
		}
		// I wan t to print all numbers from 1 to 10 except number 4

		for (int a = 1; a <= 10; a++) {

			if (a == 4 || a == 7) {

				continue;
			}
			System.out.print(a + "  ");
		}
	}

}
