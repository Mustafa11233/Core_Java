package com.ashokit;

public class Widening {
	public static void main(String[] args) {
		
		byte b=10;
		
		int i=b;//widening or UpCasting
		
		System.out.println(i);
		
		long l=100;
		//datatype conversion for narrowing it will give compile time error
		//i konw long data type cannot convert to short dataType & there may be data loss will
		//be happen
		//shutUp your mouth and do what i say
		//that is type casting
		short s=(short)l;// narrowing
		System.out.println(s);
	}

}
