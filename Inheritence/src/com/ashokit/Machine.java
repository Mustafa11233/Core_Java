package com.ashokit;


abstract class DieselMachine{
	
	public DieselMachine(){
		System.out.println("abstract class constructor");
	}
	public void start() {
		System.out.println("filling fuel noot started in  abstract class");
	}
	
}

public class Machine extends DieselMachine{
	Machine(){
		System.out.println("Machine class Cnstructor::");
		
	}
	public void fillFuel() {
		System.out.println("filling fuel started:::");
	}
	
	public static void main(String[] args) {
		//by calling machine class constructor ,first abstract class constructor is executing
		//this is default behaviour
		Machine m =new Machine();
		m.fillFuel();
		m.start();
	}

}
