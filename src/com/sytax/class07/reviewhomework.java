package com.sytax.class07;

import java.util.Scanner;

public class reviewhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for sale");
		String sale = input.next();
		if (sale.equalsIgnoreCase("no")) {
			System.out.println("you are not going for shopping");
		} else if (sale.equalsIgnoreCase("yes")){
			System.out.println("what is the price of the item?");
			int actualPrice = input.nextInt();
			int discount = 0;
			if (actualPrice < 20) {
				discount = 10;
			} else if (actualPrice >= 20 && actualPrice <= 100) {
				discount = 20;
			} else if (actualPrice >= 100 && actualPrice <= 500) {
				discount = 30;
			} else {
				discount = 50;
			}
			int saving = (actualPrice * discount) / 100;
			int finalPrice = actualPrice - saving;
			
			System.out.println("After " + discount + "% discount the price of the item reduce from " + actualPrice
					+ " to " + finalPrice);
		}
		
		
	}

}
