package in.ashokit.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

public class PredicatePersonDemo {
	
	public static void main(String[] args) {
		Person p1=new Person("raju",12);
		Person p2=new Person("Rani",29);
		Person p3=new Person("King",32);
		Person p4=new Person("Queen",16);
		
		List<Person> Persons = Arrays.asList(p1,p2,p3,p4);
		 
		Predicate<Person> predicate = p -> p.age>=18;
		
		for(Person person : Persons) {
			 if(predicate.test(person)) {
				 System.out.println(person.name);
			 }
			
		}
	}

}
