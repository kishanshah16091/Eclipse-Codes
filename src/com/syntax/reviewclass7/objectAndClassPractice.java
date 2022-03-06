package com.syntax.reviewclass7;

public class objectAndClassPractice {
	// What is class in java
	// What is object - attributes, behaviors,
	// void is non return type method
	String empName;
	int empID;
	String group;

	// local variable
	void employeeDetails() {
		System.out.println("This method shoes the details of the employee ");
	}

	void employeeGroup() {
		System.out.println("this method shows the group of the employee ");
	}

	public static void main(String[] args) {
		objectAndClassPractice obj = new objectAndClassPractice();
		obj.employeeGroup();
		obj.employeeDetails();
	}

}
