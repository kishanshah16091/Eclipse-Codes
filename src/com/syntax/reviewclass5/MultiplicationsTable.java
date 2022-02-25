package com.syntax.reviewclass5;

public class MultiplicationsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a < 2; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					System.out.print((a + c) + " X " + b + " = " + (a + c) * b + "\t");
				}
				System.out.println();
			}
		}
	}

}
