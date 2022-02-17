package com.syntax.class09;

public class ForEachLoop {

	

	public static void main(String[] args) {
		// if you have an array you can use for each loop to iterate/loop through the entire array
		String[] cities = { "Washington DC", "Miami", "Los Angeles", "New York" };
		for (String city:cities) {
			System.out.println(city);
		}
		System.out.println("*************************");
		
		int[]numbers= {10,20,30,40};
		for (int num:numbers) {
			System.out.print(num+ "  ");
		}
		
		System.out.println();
		System.out.println("*************************************************");
		String[] countries = new String[5];

		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Nepal";
		countries[4] = "Morocco";
		for(String country:countries){
			
			System.out.println(country);
		}
	}

}
