package com.sytax.class14;

public class Task4 {

	// Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com or

	String createEmail(String userName, String lastName, String emailType) {
		return userName + lastName + "@" + emailType + ".com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 obj = new Task4();
		System.out.println(obj.createEmail("Zul", "fiya", "gmail"));

	}

}
