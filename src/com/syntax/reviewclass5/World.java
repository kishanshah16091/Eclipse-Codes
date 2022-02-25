package com.syntax.reviewclass5;

public class World {

	public static void main(String[] args) {
		Human Human1 = new Human();
		Human1.name="Kishan";
		Human1.lastName="Shah";
		Human1.eyeColor="blue";
		Human1.hairColor= "Black";
		Human1.age=33;
		Human1.gender='m';
		
		//Human1.hands=2; CE:hands was not declared in the human class
		
		Human1.sleep();
		Human1.eat();
		Human1.run();
		
		//new Humans();
	}

}
