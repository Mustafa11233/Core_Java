package com.ashokit;

public class Demo2 {
	
	void m1(int a,int b) {
		System.out.println("m1() method started");
		int c=a/b;
		System.out.println(c);
		System.out.println("m1() method ended");
		
	}
	public static void main(String[] args) {
		System.out.println("main() method started");
		try {
		Demo2 d=new Demo2();
		d.m1(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main() method ended");
	}

}
