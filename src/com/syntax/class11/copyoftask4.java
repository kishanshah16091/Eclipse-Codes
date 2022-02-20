package com.syntax.class11;

public class copyoftask4 {

	public static void main(String[] args) {
		// Enhance loop 

		int[][] array2D = { { 2, 3, 4 }, { 5, 6 }, { 12, 6, 8 } };
		int sumEven = 0;
		int sumOdd = 0;
		for (int[] row : array2D) {
			for (int element : row) {
				if (element % 2 == 0) {
					sumEven += element;
				} else {
					sumOdd += element;
				}
			}
		}
		System.out.println("Sum of Even numbers " + sumEven);
		System.out.println("Sum of Odd numbers " + sumOdd);
}
	

}
