package com.syntax.class12;

public class Dog {
	// attributes,also called fields,properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;

    // Behaviors, Functions and methods 
	void bark() {
		System.out.println("Dog is barking...");
	}

	void eat() {
		System.out.println("Dog is eating");
	}

	void sleep() {
		System.out.println("Dog is sleeping");
	}

	public static void main(String[] args) {
		//Creating an object scooby from class Dog
        Dog scooby=new Dog(); 
        //Dog is a class
        //scooby is an object
        //= is an assignment operator
        // new is keyword that we use to create the object of the class
        //dog() we are calling the constructor of the class
        //Scanner scan=new Scanner(System.in);
        scooby.bark();
        scooby.eat();
        scooby.sleep();

	}

}
