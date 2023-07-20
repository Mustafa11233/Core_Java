package com.ashokit;

class Parent {
	void m1() {
		System.out.println("Hai Iam from parent m1() method");
	}

	void m2() {
		System.out.println("Hai Iam from parent m2() method");
	}

	public int hashCode() {
		return 101;
	}
}

class Child extends Parent {

//	public int hashCode() {
//		return 105;
//	}
	void m1() {
		System.out.println("Hai Iam from child m1() method");
	}

	void m2() {
		super.m2();
		System.out.println("Hai Iam from child m2() method");
		super.m1();
	}
}

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		int hashCode = c.hashCode();
		System.out.println(hashCode);
	}

}
