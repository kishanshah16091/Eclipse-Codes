package com.sytntax.reviewclass04;

public class loopNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			if (i == 6) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
