package com.syntax.homework;

public class replit067 {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 2 4 6 8 10 12 14 16 18 20
		 * 
		 * 3 6 9 12 15 18 21 24 27 30
		 * 
		 * 4 8 12 16 20 24 28 32 36 40
		 * 
		 * 5 10 15 20 25 30 35 40 45 50
		 */

		for (int i = 1; i <= 10; i++)

			System.out.print(i + " ");
		System.out.println();
		{
			for (int j = 1; j <= 20; j++)
				if (j % 2 == 0)
					System.out.print(j + " ");
			System.out.println();
			{
				for (int k = 1; k <= 30; k++)
					if (k % 3 == 0)
						System.out.print(k + " ");
				System.out.println();
				{
					for (int a = 1; a <= 40; a++)
						if (a % 4 == 0)
							System.out.print(a + " ");
					System.out.println();
					{

						for (int l = 1; l <= 50; l++)
							if (l % 5 == 0)
								System.out.print(l + " ");

					}

				}
			}
		}
	}
}
