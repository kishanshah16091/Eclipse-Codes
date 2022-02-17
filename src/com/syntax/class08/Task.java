package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// i want to find out the sum off even and all odd numbers from the range 1 to
		// 50
		int sumEven = 0;
int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {

		}
		int i = 0;
		if (i % 2 == 0) {
			sumEven = sumEven + i;
		}else {
			sumOdd=sumOdd+i;
		}
		System.out.println("the som of all even numbers ="+sumEven+ " and the sum of all odd numbers =" +sumOdd);
	}
	

}
