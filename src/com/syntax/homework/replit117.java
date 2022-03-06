package com.syntax.homework;

public class replit117 {

	public static void main(String[] args) {
	
		System.out.println(sumEvenToX(5));
		System.out.println(sumEvenToX(8));
	}

	public static int sumEvenToX(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
