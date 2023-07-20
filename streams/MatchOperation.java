package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchOperation {
	public static void main(String[] args) {
		
		Person p = new Person("Raju","Japan");		
		Person p1 = new Person("steve","USA");	
		Person p2 = new Person("Ashok","India");	
		Person p3 = new Person("Ching","China");	
		Person p4= new Person("Rani","India");	
		Person p5 = new Person("Rakesh","BangKOk");	
		
		List<Person> persons = Arrays.asList(p,p1,p2,p3,p4,p5);
		boolean status = persons.stream().anyMatch(i -> i.country.equals("India"));
		System.out.println("Any Indian Available ?:: " + status);
//		
//		List<Person> person = Arrays.asList(p,p1,p2,p3,p4,p5);
//		boolean status1 = person.stream().anyMatch(i -> i.country.equals("Japan"));
//		System.out.println("Any Japan Available ?:: " + status1);
//		
//		boolean status2 = person.stream().allMatch(i -> i.country.equals("India"));
//		System.out.println("All Persons from India ?:: " + status2);
//		
//		boolean status3 = person.stream().noneMatch(i -> i.country.equals("Mexico"));
//		System.out.println("No Persons from Mexico ?:: " + status3);
//		
		Optional<Person> findFirst = persons.stream().filter(i -> i.country.equals("India"))
		       .findAny();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}

}
class Person{
	String name;
	String country;
	
	public Person(String name,String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}