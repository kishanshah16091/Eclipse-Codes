package com.syntax.homework;

import java.util.Arrays;

public class Replt79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 4, 2, 0, 3, 3, 2, 0 }, { 4, 0, 1, 5, 6, 1, 1, 0 }, { 1, 2, 3, 1, 4, 0, 1, 6 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}