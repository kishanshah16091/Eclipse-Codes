package com.syntax.homework;

public class repit83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] arr = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2} }; //sum = 3
		
		int[] total = new int[arr.length];
		// first loop for outer array
		for (int i = 0; i < arr.length; i++) {
		    // loop for inner array
		    for (int k = 0; k < arr[i].length; k++) {
		        // since default value of total[i] is 0, we can directly use +=
		        total[i] += arr[i][k];

	}
}}

}