package com.syntax.projectTask;

public class ed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDArray = { { 5, 6, 7, 8, 9 }, // index 0
				{ 15, 16, 17, 18, 19 }, // index 1
				{ 25, 26, 27, 28, 29 } // index 2

		};

		for (int[] eachArray : twoDArray) {

			for (int eachElementOfArray : eachArray) {

				if (eachElementOfArray % 2 == 0)

					System.out.print(eachElementOfArray + " ");

			}

		}
		System.out.println();
		for (int[] eachArray : twoDArray) {

			for (int eachElementOfArray : eachArray) {

				if (eachElementOfArray % 2 != 0)

					System.out.print(eachElementOfArray + " ");

			}
		}

	}

}
