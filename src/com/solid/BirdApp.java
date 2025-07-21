package com.solid;

public class BirdApp {
	
	public static void main(String[] args) {
		
		Crow crow = new Crow();
		crow.display();
		crow.fly();
		
		
		Parrot parrot = new Parrot();
		parrot.display();
		parrot.fly();
		
		
		Bird penguin = new Penguin();
		penguin.display();
		
		System.out.println("Changes in main method");
		System.out.println("change 2");
				
	}

}
