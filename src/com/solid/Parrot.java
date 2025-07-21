package com.solid;

public class Parrot extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Parrot is flying.");
	}

	@Override
	public void display() {
		System.out.println("Parrot Here.");
		
	}

}
