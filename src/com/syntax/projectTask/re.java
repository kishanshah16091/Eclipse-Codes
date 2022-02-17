package com.syntax.projectTask;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] twoDArray = { { 5, 6, 7, 8, 9 }, // index 0
				{ 15, 16, 17, 18, 19 }, // index 1
				{ 25, 26, 27, 28, 29 } // index 2
		};
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for (int[] eachArray : twoDArray) {
			for (int eachElementOfArray : eachArray) {
				if (eachElementOfArray % 2 == 0) {
					sumOfEven = sumOfEven + eachElementOfArray;

					System.out.println(eachElementOfArray + " ");

				}
			}
		}
	}

}
