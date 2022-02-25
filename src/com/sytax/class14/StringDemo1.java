package com.sytax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Kishan";
		String name2 = new String("Kishan ");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name2.length());
		System.out.println(name.length());
		System.out.println(name2.toLowerCase());
		System.out.println(name2.toUpperCase());
		System.out.println(name + name2);// You should always prefer this method to perform concatenation
		System.out.println(name.concat(name));
		System.out.println(name.isEmpty());
		
	}

}
