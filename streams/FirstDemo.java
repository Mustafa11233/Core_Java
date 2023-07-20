package in.ashokit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo {
	public static void main(String[] args) {

		// Approach-1
		// Stream<Integer> stream1 = Stream.of(66,22,33,54,45);

		List<Integer> list = Arrays.asList(6, 22, 33, 54, 45);

//		for(Integer i: list) {
//			if(i>20) {
//				System.out.println(i);
//			}
//		}

//		Stream<Integer> stream = list.stream();
//		
//		Stream<Integer> filter = stream.filter(i -> i>20);
//		
//		filter.forEach(i -> System.out.println(i));

		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

//		ArrayList<String> names = new ArrayList<>();
//		names.add("John");
//		names.add("Robert");
//		names.add("Orlen");
//		
//		//Approach-2 
//		Stream<String> stream2 = names.stream();
//		
		List<String> list2 = Arrays.asList("Jhon", "Anushka", "Arun", "Arjun", "Ajay", "Smith");
		list2.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
		Userr u1 = new Userr("Jhon", 18);
		Userr u2 = new Userr("Smith", 16);
		Userr u3 = new Userr("Aitha", 22);
		Userr u4 = new Userr("rajesh", 32);
		Userr u5 = new Userr("Arishna", 29);
		Userr u6 = new Userr("Rakesh", 27);
		Userr u7 = new Userr("Mohan", 50);

		Stream<Userr> stream = Stream.of(u1, u2, u3, u4, u5, u6, u7);
		// stream.filter(u -> u.age>=25).forEach(u -> System.out.println(u));
		// stream.filter(u -> u.age >=18 && u.name.startsWith("A")).forEach(u ->
		// System.out.println(u));

		stream.filter(u -> u.age >= 18).filter(u -> u.name.startsWith("A")).forEach(u -> System.out.println(u));

	}

}

class Userr {
	String name;
	int age;

	Userr(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Userr [name=" + name + ", age=" + age + "]";
	}

}
