package com.syntax.class03;

public class primitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main+ctr+space
		// main+ctr+space --- auto complete

		int i = 10;

		// Widening or implicit\
		// we store int value 10 inside double variable

		double d = 10;
		System.out.println(i); // 10
		System.out.println(d); // 10.0

		// int num=10.0; // type mismatch cannot covert from double to int

		// Casting
		/*
		 * What - is a process of converting the value from one type to another 2 types
		 * of Casting Widening / implicit / Automatic
		 * 
		 * Widening = is smallest to biggest
		 * 
		 * byte - - short -- int -- long -- float -- double
		 * 
		 * Narrowing / Explicit / Manual double - float - long - int - short - byte
		 * int1=10.99 -- cannot covert from double to int
		 * 
		 * 
		 */

//narrowing or explicit casting	
		// we store double value 10.99 into int variable
		int num = (int) 10.99;
		System.out.println(num);

		float f=10.99f;
		
		byte b=(byte)1000;
		System.out.println(b);
		
		
		int bigNumber=(int)344444546546546546l;
		System.out.println(bigNumber);
		
		
		/* Operators:
		 * assignment (=)
		 * arithmetical = _, +, *, /, %
		 * relational = 
		 */
		
			
	}

}
