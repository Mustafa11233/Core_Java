package com.ashokit;

public class Casting implements Cloneable {
	
	int i;
	String name;
	
	public String toString() {
		return "Casting "+i+"==="+name+"==="+"Casting";
	}
	public static void main(String[] args) throws Exception{
		
		
		
		Casting c=new Casting();
		Object object = c.clone();
		
		      Casting c1=(Casting)object;
		      System.out.println(c1.toString());
		
		
	}

}
