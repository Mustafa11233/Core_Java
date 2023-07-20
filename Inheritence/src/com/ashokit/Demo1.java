package com.ashokit;

public class Demo1 {
	
	void m1(int a,int b) {
		System.out.println("m1() method started");
		try {
			int c=a/b;
			System.out.println(c);
			
		}catch(Exception e) {
			
		}
		System.out.println("m1() method ended");
	}
	public static void main(String[] args) {
		System.out.println("main() method started");
		Demo1 d=new Demo1();
		d.m1(10, 0);
		System.out.println("main() method ended");
	}

}
