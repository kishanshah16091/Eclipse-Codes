package com.syntax.homework;

import java.util.Scanner;

public class replit102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	   String[]strArray=word.split("");
	  for (int i=0; i<strArray.length; i++){
	    System.out.println(strArray[i]);
	  }
	}

}
