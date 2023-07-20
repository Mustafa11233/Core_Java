package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector {
	public static void main(String[] args) {
		Person1 p6 = new Person1("Raju","Japan");		
		Person1 p1 = new Person1("steve","USA");	
		Person1 p2 = new Person1("Ashok","India");	
		Person1 p3 = new Person1("Ching","China");	
		Person1 p4= new Person1("Rani","India");	
		Person1 p5 = new Person1("Rakesh","BangKOk");	
		
		List<Person1> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
//		List<Person1> indians = persons.stream()
//			                           .filter(p -> p.country.equals("India"))
//			                           .collect(Collectors.toList());
//		System.out.println(indians.size());
//		indians.forEach(i -> System.out.println(i));
		
//		List<Person1> indians = persons.stream().filter(p -> p.country.equals("India"))
//			                                    .collect(Collectors.toList());
//		indians.forEach(i -> System.out.println(i.name));
		
		List<String> names = persons.stream()
		                            .filter(i -> i.country.equals("India"))
		                            .map(i -> i.name)
		                            .collect(Collectors.toList());
		
		System.out.println(names);
	}

}
class Person1{
	String name;
	String country;
	
	public Person1(String name,String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}