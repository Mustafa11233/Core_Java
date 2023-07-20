package com.ashokit.rbi;

public class Demo {
	public static void main(String[] args) {
		
	SBIBank b1=new SBIBank();
	SBIBank b2=new SBIBank();
	boolean status1 = b1.equals(b2);
	if(status1) {
		System.out.println( "Both SBIobjects are Equal??"+status1);
		
	}else {
		System.out.println("both objects are not equal");
	}
	
	String s=new String("Ashok");
	String s1=new String("Ashok");
	     boolean  status=s.equals(s1);
	     if(status) {
	    	 System.out.println("both String objects are equals??"+status);
	     }
	}
}
