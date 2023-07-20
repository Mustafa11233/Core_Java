package com.ashokit;

public class ParameterizedConstructor {
	
	public ParameterizedConstructor(String name,float salary) {
		System.out.println(name);
		System.out.println(salary);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor("Raju",25000f);
		ParameterizedConstructor p1=new ParameterizedConstructor("Rani",15000f);
		
		
		
	}

}
