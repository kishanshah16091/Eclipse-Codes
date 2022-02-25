package com.sytax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "    Kishan         ";
		System.out.println(name);
		System.out.println(name.trim());

		String name2 = "Run Kishan"; // a person who always fear his wife and is always obedient or submissive to his
										// wife
		System.out.println(name2.startsWith("Run"));// method chaining
		System.out.println(name2.startsWith("Kishan"));

		System.out.println(name2.toUpperCase().startsWith("Run"));
		System.out.println(name.endsWith("Kishan"));
		System.out.println(name2.contains("S"));
		System.out.println(name2.toLowerCase().contains("Run"));
	}

}
