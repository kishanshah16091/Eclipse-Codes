package com.syntax.class09;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("______ CLOCK ________");
		String time;
		for (int h = 0; h < 24; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h < 10 && m > 10) {
					System.out.println(time = "0" + h + ":" + m);
				}
			}
			System.out.println("__________________________");

			for (int hours = 0; hours < 24; hours++) {
				for (int min = 0; min <= 59; min++) {
					if (hours < 10 && min < 10) {
						time = "0" + hours + ":" + "0" + min;
						System.out.println(time);
					} else if (hours < 10 && min >= 10) {
						time = "0" + hours + ":" + min;
						System.out.println(time);
					} else if (hours >= 10 && min < 10) {
						time = hours + ":" + "0" + min;
						System.out.println(time);
					} else {
						time = hours + ":" + min;
						System.out.println(time);
					}

				}
			}
		}
	}
}
