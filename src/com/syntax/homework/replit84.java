package com.syntax.homework;

public class replit84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int neg = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > 0)
					neg++;
			}
		}
		System.out.println(neg);
	}

}
