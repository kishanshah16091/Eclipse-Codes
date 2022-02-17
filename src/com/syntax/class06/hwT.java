package com.syntax.class06;

import java.util.Scanner;

public class hwT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car = scan.next();
        
		String carOrigin;
           
		switch (car) {
		case  "BMW":
        carOrigin ="germany car";
		break;
        case  "Toyota":	
        carOrigin = "Japanese car";
		
		break;
		case  "Maserati":         
		carOrigin = "italian car";
        
		break;
		default:        
			carOrigin = "unknown";

		}

		System.out.println("Your favorite car is "+carOrigin);

	}

}


