package com.syntax.class05;

public class logicalNot {

	public static void main(String[] args) {
		// Logical not is used to revert the condition

		boolean value = !false;
		System.out.println(value);
		System.out.println("___________________");

		boolean traffic = true;
		if (!traffic) {

			System.out.println("I will come on time to work");
		}
		System.out.println("______________________");
		String day = "Saturday";
		if (!day.equals("Saturday"))
			System.out.println("Today is not Saturday");
		
		
		boolean checkboxChecked=true;
		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		System.out.println("____________________");
		String java="hard";
		if (!java.equals("hard")) {
			System.out.println("You are a geniuos");
			
			String java1="easy";
			if (java1.equals("hard")) {
				System.out.println("You are a geniuos");
		}
			System.out.println("______");

		System.out.println("________________________THE END__________________");
	}

}
}
