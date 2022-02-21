package com.syntax.class12;

public class Phone {
	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with
	// specific attributes and behaviors.

	String name;
	String color;
	double size;
	int Resolution;

	// Behaviors, Functions and methods
	void name() {
		System.out.println("The mobile is iphone");
	}

	void color() {
		System.out.println("The mobile color is black");
	}

	void size() {
		System.out.println("The screen size is bigger then other mobile");
	}

	void resulation() {
		System.out.println("Resolution is very high");
	}

	void printCompleteInfo() {
		System.out.println("name =" + name);
		System.out.println("color =" + color);
		System.out.println("size =" + size);
		System.out.println("Resolution =" + Resolution);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone apple = new Phone();
		Phone Google = new Phone();
		Phone Nokia = new Phone();
		apple.name = "iPhone";
		apple.color = "Black";
		apple.size = 6.1;
		apple.Resolution = 1080;
		apple.printCompleteInfo();
		System.out.println("******************");
		Phone nokia = new Phone();
		nokia.name = "Nokia";
		nokia.color = "Silver";
		nokia.size = 4.1;
		nokia.Resolution = 720;
		nokia.printCompleteInfo();
		System.out.println("***********");
		
		Google.name = "Pixel";
		Google.color = "Red";
		Google.size = 5.1;
		Google.Resolution = 1080;
		Google.printCompleteInfo();
		apple.name();
		Nokia.name();
	}

}
