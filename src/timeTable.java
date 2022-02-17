
public class timeTable {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 * Guys if can, please try to complete a clock exercise. You can pick 12 or 24
		 * hour clock.
		 * 
		 * 2. Try to create a multiplication table that will
		 * 
		 */

		for (int h = 1; h <= 24; h++) {

			for (int m = 0; m <= 59; m++)
				;

			int m = 0;
			for (int s = 0; s <= 59; s++)

				System.out.println(h + ":" + m + ":" + s);
		}

		int num = 7;
		while ( 98%7==0) {
			num++;
			System.out.println(num);
		}

	}

}
