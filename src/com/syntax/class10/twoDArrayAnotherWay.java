package com.syntax.class10;

public class twoDArrayAnotherWay {

	public static void main(String[] args) {

		int[][] numbers = { { 10, 20, 30, }, { 100, 200, 300, 400 }, { 1000, 2000, } };
		
		System.out.println(numbers[2][1]);//2000
		System.out.println(numbers[0][0]+numbers[0][1]);
		
		
		
		int size=numbers.length;
		System.out.println(size);//3
		
		int sizeof1Array=numbers[0].length;//4
		System.out.println("size of second array = "+sizeof1Array);//4
		
		int sizeof2Array=numbers[1].length;
		System.out.println("size of second array = "+sizeof2Array);
		int sizeof3Array=numbers[2].length;
		System.out.println("size of third array = "+sizeof3Array);
		
		//
	}
	

}
