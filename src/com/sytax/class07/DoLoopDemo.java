package com.sytax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		
		System.out.println("------ while check condation before execution -----");
		int num=10;
		while (num<=3) { // more used than do while 
		System.out.println("hello");
		num++;
		
		}
System.out.println("------- Do WhileCheck condition fter execution ------");
		int num1=10;
		do { // is less used than while
			System.out.println("hello");
			num1++;
			
		}while(num1<=3);
		
		
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int num2=1;
		do {
			System.out.print(num2+" ");
			num2++;
		}while (num2<=30);
	}
		
	}


