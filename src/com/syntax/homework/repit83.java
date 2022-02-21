package com.syntax.homework;

public class repit83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[][] arr = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } }; // sum = 3

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		for (int i = 0; i < a.length; i++) {
			int sum1 = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum1 += a[i][j];
			}
			System.out.println(sum1);
		}
	}

}
