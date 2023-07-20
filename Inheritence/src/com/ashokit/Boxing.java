package com.ashokit;

public class Boxing {
	public static void main(String[] args) {	
		
		int i=10;
		
		Integer i20=new Integer(i);//auto-boxing
		System.out.println(i20);//calls toString method
		
		
		int j=i20;//auto unboxing
		System.out.println(j);

	}

}
