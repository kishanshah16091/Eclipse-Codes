package com.sytax.class07;

import java.util.Scanner;

public class quizep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean w = input.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean q = input.nextBoolean();
		if (w==w && w!=q ){
			String drink="water";
			System.out.println("Looks like you need to drink "+drink);
		} else if (w==w && q==q) {
			String drink1="coffee";
					System.out.println("Looks like you need to drink "+drink1);
		}else if (!w=q && !q=w) {
			String drink2 = "tea";
			System.out.println("Looks like you need to drink "+drink2);
		}else  {
			String drink3 = "nothing";
			System.out.println("Looks like you need to drink "+drink3);
		}
		
		
		}

	}

