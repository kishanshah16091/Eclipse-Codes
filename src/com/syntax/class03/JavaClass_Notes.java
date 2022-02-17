package com.syntax.class03;

public class JavaClass_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dayTime = "morning";

		int date = 22;
		String month = "january";
		// Today is morning of January 22.
		// + used to attach string to anything
		String sentence = ("Today is " + dayTime + " of " + month + " " + date);
		System.out.println(sentence);

		
		
		int year=2022;
		String year1="2022";
		
		System.out.println(year+10);
		System.out.println(year1+10);
		
		// +, -, *, /, %
		
		//= is assignment operators 
		
		int num=100;
		num=num+100;
		System.out.println(num);
		num+=100; // This exact means ---- this num=num+100
		System.out.println(num);//300
		num-=20;
		System.out.println(num);//280
		num/=10; // shorter way of num=num/10
		System.out.println(num);//28
		num%=2;
		System.out.println(num); // 0
		
		
		
		int value=500;
		value+=500;
		value+=200;
		System.out.println(value);
		
		value-=60;
		System.out.println(value);
		
		int cake=11;
		cake/=4;
		System.out.println(cake);
		int cake1=25;
				cake1/=7;
				System.out.println(cake1);
		
		
		
		
	}

}
