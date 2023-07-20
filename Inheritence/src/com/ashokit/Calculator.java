package com.ashokit;

public class Calculator {
	
	//this is variable arguments,arguments will vary with respect to values
	public void add(int... a) {
		int sum=0;
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println(sum);
		
		
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10,20,48,349,24,332,345,345,5,23424,2);
		c.add(19,28,37);
	}

}
