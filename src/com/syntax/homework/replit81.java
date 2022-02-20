package com.syntax.homework;

import java.util.Arrays;

public class replit81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp, size;
		int[] array = { 5, 4, 8 };

		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[size - 1]);
	}
}
