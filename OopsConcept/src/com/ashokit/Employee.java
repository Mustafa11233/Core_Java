package com.ashokit;

public class Employee {
	
	//instance variables
	String name;
	double salary;
	
	//this data available in local variable
	public Employee(String name,double salary	) {
		// s is a value,name is a variable
		//f is a value ,salary is a variable
		//value is initilized to variable
		
		    this.name=name;
		     this.salary=salary;
		
		System.out.println(this.name+"======"+this.salary);
		
	}
	Employee(String name){
		this.name=name;
		System.out.println(this.name+"==="+this.salary);
	}
	
	
	
	public static void main(String[] args) {
		//values initilized to constructor local variable
		Employee e=new Employee("Raju",25000);//pointing to 2 parameterized constructor
		Employee e1=new Employee("Rani",15000);//pointing to 2 parameterized constructor
		Employee e2=new Employee("Anil");//it is pointing to single args constructor
		//Employee object is behaving in two ways
		//one object exhibits Multiple behavieur based on situation
		//polymerfic behaviour is Polymorpisom 
	}

}
