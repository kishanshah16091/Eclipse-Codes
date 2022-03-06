package com.syntax.homework;

public class replit112 {
	static void printNum(int n) {
		if (n > 0) {
			printNum(n - 1);
			System.out.println(n + " ");
		}
		return;
	}

	public static void main(String[] args) {
		printNum(10);
	}
}