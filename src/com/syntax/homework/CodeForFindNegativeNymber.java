package com.syntax.homework;

public class CodeForFindNegativeNymber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] < 0) {
					System.out.println(a[row][col]);
				}
			}
		}
	}
}
