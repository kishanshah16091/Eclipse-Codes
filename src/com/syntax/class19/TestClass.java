package com.syntax.class19;

public class TestClass {
	// Write a java class that will have a constructor: one with parameters and
	// second without any parameters. Create a separate
	// Test class where you will execute both of the constructors 1 by 1.
	String name = "java";
	String subject = "Constructor";
	int numOfClass = 19;

	TestClass(String name, String subject, int numOfClass) {
		name = name;
		subject = subject;
		numOfClass = numOfClass;
	}

	TestClass() {
	}

	void printinTc() {
		System.out.println("class name: " + name + " chapter is " + subject + " class is " + numOfClass);
	}
}
