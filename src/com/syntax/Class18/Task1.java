package com.syntax.Class18;

public class Task1 {
	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from that array.
	// Method should be visibly only within same package and accessible by the
	// creating an instance of the class.
	
	int sumArray(int [] array) {
	int sum=0; 
	for (int num:array) {
		sum+=num;
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 10, 10 };
		Task1 task = new Task1();
		System.out.println(task.sumArray(array));
	}

}
