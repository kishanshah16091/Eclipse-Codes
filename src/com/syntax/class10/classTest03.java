package com.syntax.class10;

public class classTest03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array (longer way)where you will store the following values: Mr,
		 * Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After storing values print
		 * following String: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String[][] values = new String[5][5];

		values[0][0] = "Mr";
		values[0][1] = "Mrs";
		values[0][2] = "Ms";
		values[0][3] = "Miss";

		values[1][0] = "Smith";
		values[1][1] = "Jordan";
		values[1][2] = "Jackson";
		values[1][3] = "Obama";

		System.out.println(values[0][1] + " " + values[1][0]);
		System.out.println(values[0][0] + " " + values[1][3]);
		System.out.println(values[0][2] + " " + values[1][2]);
		System.out.println(values[0][3] + " " + values[1][1]);

		System.out.println("******** Task Two *********");

		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names
		 * and second array will contain grades. Then your program should print name of
		 * the students that has A and B grade
		 */

		String[][] namesAndGrades = { { "Smith", "Jordan", "Jackson", "Obama" }, { "A", "B", "C", "D" } };

		System.out.println( namesAndGrades[0][0] + " grade " + namesAndGrades[1][0]);
		System.out.println( namesAndGrades[0][1] + " grade " + namesAndGrades[1][1]);
		System.out.println( namesAndGrades[0][2] + " grade " + namesAndGrades[1][2]);
		System.out.println( namesAndGrades[0][3] + " grade " + namesAndGrades[1][3]);
		
		
	
	}

}
