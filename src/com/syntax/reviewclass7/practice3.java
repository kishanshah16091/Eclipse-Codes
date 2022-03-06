package com.syntax.reviewclass7;

public class practice3 {
	String studentName;
	String course;
	int studentId;
	int grades;

	void displayStudentRecord() {
		System.out
				.println("The student name is : " + studentName + " and the course student enrolled for is " + course);
		System.out.println("The studen id is: " + studentId + " and the grades student achived are " + grades);

	}

	public static void main(String[] args) {
		//Creating the first object of class to assign first set of values
		practice3 p1 = new practice3();
		p1.studentName = "Rogo";
		p1.course = "SDET";
		p1.studentId = 123;
		p1.grades = 65;
		p1.displayStudentRecord();
		System.out.println("----------------------------------------------------------------");
		practice3 p2 = new practice3();
		p2.studentName = "Yazina";
		p2.course = "Science";
		p2.studentId = 456;
		p2.grades = 91;
		p2.displayStudentRecord();
	}

}
