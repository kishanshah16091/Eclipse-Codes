package com.sytax.class14;

public class Task5 {
//Write a method to return whether given number is prime or not?
	
	boolean isPrime(int number) {
		boolean isPrime=true;
		if (number>1) {
			for (int i=2; i<number; i++) {
				if (number%1==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
	return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task5 objName=new Task5();
		System.out.println(objName.isPrime(2));
	}

}
