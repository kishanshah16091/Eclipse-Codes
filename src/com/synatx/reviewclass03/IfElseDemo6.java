package com.synatx.reviewclass03;

public class IfElseDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sunday";
		if (day.equals("sunday")) {
			System.out.println("It's Weekend");
		}else {
			System.out.println("It's weekday");
		}
	if (day.equals("Sunday")) {
		System.out.println("It's Weekend");
	}else {
		
	}
		if (day.equals("sunday")||day.equals("Saturday")){
			System.out.println("It's Weekend");
	}else {
		System.out.println("It's Weekday");
	}
	}
}
