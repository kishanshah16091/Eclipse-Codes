package com.syntax.reviewclass5;

public class Patterns {

	public static void main(String[] args) {
		//

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println(" ---------- ");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
			System.out.println("**************************");
	
		for (int ro = 5; ro >= 1; ro--) {
			for (int co = 1; co >= 4; co--) {
				System.out.print(ro+" ");
			}
			System.out.println();
		}
		
	}
}
