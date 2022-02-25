package com.syntax.reviewclass5;

public class patTask {

	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
		System.out.println("********************* Triangle ***********************");
		for (int r = 5; r >= 1; r--) {
			for (int c = 5; c >= r; c--) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}

}
