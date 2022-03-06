package com.syntax.homework;

import java.util.Scanner;

public class replit97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.print("Proceed with Chrome browser");
		} else if (browser.equalsIgnoreCase("FIREFOX")) {
			System.out.print("Proceed with Firefox browser");
		} else if (browser.equalsIgnoreCase("IE")) {
			System.out.print("Proceed with IE browser");
		} else {
			System.out.print("Invalid browser");
		}

	}

}