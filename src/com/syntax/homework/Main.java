package com.syntax.homework;

public class Main {
 String name;
 int rollNumber;

	void name() {

		System.out.println("Name is " + name + " and roll number is " + rollNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main studenDetails = new Main();

		studenDetails.name = "John";
		studenDetails.rollNumber = 2;
		
		studenDetails.name();
	}

}
