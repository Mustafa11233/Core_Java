package com.ashokit;

public class Cloning implements Cloneable{
	public static void main(String[] args) throws Exception {
		
	
	
	Cloning c=new Cloning();
	System.out.println(c);
	Object clone = c.clone();//cloning
	System.out.println(clone);

}
}