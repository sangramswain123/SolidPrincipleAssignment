package com.solid;

public class Crow extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Crow is flying.");
		
	}

	@Override
	public void display() {
		System.out.println("Crow here.");
	}

}
