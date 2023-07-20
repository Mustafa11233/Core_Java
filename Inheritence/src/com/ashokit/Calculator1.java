package com.ashokit;

public class Calculator1 {
	public static void main(String[] args) {
		
		byte b=10;
		System.out.println(b);
		//iam keeping primitive value in object
		//it is called as Boxing
		Byte b1=new Byte(b);//boxing
		System.out.println(b1);
		
		//Object is kepping in primitive variable
		//it is called as un-boxing
		byte b2=b1;   //un-boxing
		System.out.println(b2);
	}

}
