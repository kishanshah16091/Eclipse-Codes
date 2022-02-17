package com.syntax.class09;

public class AllValuesfromArray {

	public static void main(String[] args) {

		char[] grade = { 'A', 'B', 'D', 'D', 'E', 'F' };
		// how many elements inside array?

		int size = grade.length;// 6
		System.out.println("Number of elements is = " + size);

		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + "  ");
		}
		System.out.println();
		System.out.println("********************************************************");
		
		String[] cities = { "Washington DC", "Miami", "Los Angeles", "New York" };

		for (int a = 0; a < cities.length; a++) {

			System.out.println(cities[a] + "  ");
		}
	}
}