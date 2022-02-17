package com.syntax.projectTask;

public class projectTask {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		
int[][]  arr =  {
		{ 1,2,3,4,5,6,7,8,9,10},
		{11,12,13,14},
		{15,16,17,18}
		};

int evenSum = 0, oddSum = 0;


for (int i = 0; i <arr; i++) {
    if (arr[i] % 2 == 0) {
        evenSum=evenSum +arr[i];
    }
  else {
	  oddSum=oddSum+arr[i];
  }
}

System.out.println("Even = " + evenSum);
System.out.println("Odd = " + oddSum);

	}

	private static int sizeof(int[][] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
