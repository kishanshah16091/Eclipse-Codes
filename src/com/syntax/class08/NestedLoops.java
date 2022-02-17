package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * nest loop ---> loop inside another loop
		 */

		for (int i = 1; i <= 3; i++) {
			System.out.println("A am loop " + i);

			for (int j = 1; j <= 2; j++) {
				
				System.out.println("I am nested j loop " + j);
			}
			System.out.println("   ^^^^^^^^^^^^^^^^^ ANOTHER EXAMPLE  ^^^^^^^^^      ");
			for (int c=1; c<=4; c++) {
				
				System.out.println(c);
				for (int j=1; j<3; j++)System.out.println(j);
				System.out.println("__________");
			}
			
			System.out.println("-------------Car Mileage---------");
			
			for (int a=0; a<=9; a++) {
				for(int b=0; b<=9; b++)
					for(int c=0; c<=9; c++)
						
				
					System.out.println(a+" "+b +" "+ c);
			}
			
		}
	}
}
