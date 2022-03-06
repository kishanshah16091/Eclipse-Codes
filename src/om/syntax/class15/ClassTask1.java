package om.syntax.class15;

public class ClassTask1 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY Example Output: Mom’s first name? Mary Dad’s first name? Daniel
		 * Boy or Girl? girl Suggested baby name: MAIEL
		 */
		String motherName = "Mariam";
		String fatherName = "Daniel";
		String expectation = "girl";
		String firstPart = "";
		String secondPart = "";
		if (expectation.equalsIgnoreCase("boy")) {
			firstPart = fatherName.substring(0, fatherName.length() / 2);
			secondPart = motherName.substring(motherName.length() / 2);
		} else if (expectation.equalsIgnoreCase("girl")) {
			firstPart = motherName.substring(0,motherName.length() / 2);
			secondPart = fatherName.substring(fatherName.length() / 2);

		}

		System.out.println(firstPart + secondPart);

	}

}
