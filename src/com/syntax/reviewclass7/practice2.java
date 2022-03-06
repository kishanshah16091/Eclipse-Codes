package com.syntax.reviewclass7;

public class practice2 {
	// writing method in the class to return record
	String getRecord() {
		String deparment = "QA";
		String empName = "Kishan";
		String details = "worker " + empName + " belong to " + deparment;
		System.out.println(details);
		return details;

	}

	public static void main(String[] args) {
		// Creating an object of class
		practice2 p = new practice2();
		p.getRecord();

	}

}
