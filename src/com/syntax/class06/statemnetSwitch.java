package com.syntax.class06;

public class statemnetSwitch {

	public static void main(String[] args) {
		// default value of all non primitive types is --->Null

		int day = 4;
		String dayName = null;
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
		}
		System.out.println(dayName);
	}

}
