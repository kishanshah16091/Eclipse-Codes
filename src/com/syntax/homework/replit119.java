package com.syntax.homework;

public class replit119 {
	String censorLetter(String a, String b) {
		return a = a.replace(b, "*");
	}

	public static void main(String[] args) {
		replit119 obj = new replit119();
		obj.censorLetter("computer science", "*");
		System.out.println(obj.censorLetter("computer science", "e"));
		System.out.println(obj.censorLetter("trick or treat", "t"));
	}

}
