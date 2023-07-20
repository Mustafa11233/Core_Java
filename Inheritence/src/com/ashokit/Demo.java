package com.ashokit;

public class Demo {
	
	
	public static void main(String[] args) {
		System.out.println("Main method is Started");
		
	try {	
		System.out.println("try start block");
		int i =10/0;
		
		System.out.println("try end block");
	
	
	}catch(Exception e) {
		System.out.println("in catch block");
		e.printStackTrace();
	}
		//this is unreachable code,why because exception is handling above catch block
	//program will fail at compilation
//	}catch(ArithmeticException e) {
//		e.printStackTrace();
//		
//	}
		
		System.out.println("Main Block ended");
	}

}
