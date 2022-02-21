package com.syntax.homework;

public class Main1 {
	String name;
	String bark;
	String run;
	String play;

	void bark() {
		System.out.println(name + " can bark");
	}

	void run() {
		System.out.println(name + " can run");
	}

	void play() {
		System.out.println(name + " can play");
	}

	public static void main(String[] args) {

		Main1 Husky = new Main1();
		Husky.name = "Husky";
		Main1 Bulldog = new Main1();
		Bulldog.name = "Bulldog";
		Main1 Labrador = new Main1();
		Labrador.name = "Labrador";
		Husky.bark();
		Husky.run();
		Husky.play();
		Bulldog.bark();
		Bulldog.run();
		Bulldog.play();
		Labrador.bark();
		Labrador.run();
		Labrador.play();

	}

}
