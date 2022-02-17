package com.syntax.class10;

public class classtask02 {

	public static void main(String[] args) {
		// Create a array of countries. While retrieving all values from an array print
		// capital for each country.

		String[] country = { "USA", "Canada", "Morocco" };
		String capital = null;
		for (int a = 0; a < country.length; a++) {
			switch (country[a]) {
			case "USA":
				capital = "Washington DC";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			case "Morocco":
				capital = "Rabat";
				break;
			}
			System.out.println("The Capital of the " + country[a] + " is " + capital + ".");
			
			System.out.println("___________ Another way__________");
			
			for(String countries:country) {
				
				if (country.equals("USA")) {
					capital="Washington DC";
					
				}else if (country.equals("Canada")) {
					capital="Ottawa";
			}else if (country.equals("Morocco")) {
				capital="Rabat";
		}
				System.out.println("The Capital of the " + countries + " is " + capital + ".");
				
	}
}
}
}