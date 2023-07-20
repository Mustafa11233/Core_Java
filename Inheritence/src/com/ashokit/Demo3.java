package com.ashokit;

public class Demo3 {
	
	//Exception Propagation
	//Iam  only throwing the exception but iam not intersted to handle
	//for that iam ignoring the exception by throws keyword
	void m2(int i,int j) throws Exception{
		System.out.println("Iam from m2() start");
		try {
		int k=i/j;
		System.out.println(k);
		}catch(Exception e) {
			throw new InvalidNumberException("Invalid Number");
		}
		System.out.println("Iam from m2() end");		
	}
	
	
	
	void m1(int a,int b) throws Exception{
		System.out.println("Iam from m1() method start");
		m2(a,b);
		System.out.println("Iam from m1() end");
	}
	public static void main(String[] args) {
		System.out.println("Iam from main method start");
		try {
		Demo3 d=new Demo3();
		d.m1(10, 0);
		}catch(Exception e) {
			System.err.println("the exception is::"+e);
			
		}
		System.out.println("Iam from method main end");
	}

}
