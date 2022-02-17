package com.sytntax.reviewclass04;

public class Loops {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 4) {
			System.out.println("Batch 12 is great" + i);
			i++;
		}

		System.out.println("Next Code");

		for (int i1 = 5; i1 <= 21; i1++)
			if (i1 % 2 != 0) {
				System.out.println(i1);
			}
		System.out.println("____------____----____");
		for (int n = 0; n < 20; n++)
			System.out.println("Good Morning" + n);

		for (int y = 10; y > 0; y--)
			System.out.println(y);
		System.out.println("Happy New Year!");
	}

}
