package com.ashokit;

import java.util.Arrays;

public class Person {
	int id;
	String name;
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		Person p=new Person();
		
		Person p1=new Person();
		p1.id=1;
		p1.name="Raju";
		Person p2=new Person();
		p2.id=2;
		p2.name="Rani";
		p2.m1(p2, p1);
		Person[] m2 = p.m2();
	System.out.println(Arrays.toString(m2));
	
	System.out.println("================");
	
	for(Person i:m2) {
		System.out.println(i.id+"====="+i.name);
	}
		
		System.out.println("======================");
		
		for(int j=0;j<m2.length;j++) {
			System.out.println(m2[j].id+"======="+m2[j].name);
		}
	}
	
		
	
	
	Person[] m2() {
		Person p=new Person();
		p.id=1;
		p.name="Anil";
		
		Person p1=new Person();
		p1.id=2;
		p1.name="Raju";
		
		Person p2=new Person();
		p2.id=3;
		p2.name="Rani";
		
		Person[] arr= {p,p1,p2};
		
		return arr;
	}

void m1(Person p1,Person p2) {
	System.out.println(p1.id+"==="+p1.name);
	System.out.println(p2.id+"==="+p2.name);
}
}