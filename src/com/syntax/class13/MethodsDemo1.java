package com.syntax.class13;

public class MethodsDemo1 {
	void checkEvenOdd(int number) {
		System.out.println(number);
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		
        MethodsDemo1 object1=new MethodsDemo1();
        object1.checkEvenOdd(120);
        object1.checkEvenOdd(3);
        object1.checkEvenOdd(7);
        
	}

}
