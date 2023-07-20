package com.ashokit;


class Engine{
	int id;
	String name;
	String fuelType;
	
	void start() {
		System.out.println("Engine is Started");
	}
}

public class Car {
	
	void drive() {
		Engine e=new Engine();//HAS-A Relation
		e.start();
		System.out.println("Journey Ended::");
	}
	
	
	
	
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		
		
	}

}
