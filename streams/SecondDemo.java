package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;

public class SecondDemo {
	public static void main(String[] args) {
		
	//	List<String> names = Arrays.asList("india","usa","uk","japan");
		
//		for(String name:names) {
//			System.out.println(name.toUpperCase());
//		}
		//names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
//		names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
	
		List<String> names = Arrays.asList("akash","ajay","raju","rani");
		
		names.stream()
			 .filter(name -> name.startsWith("a"))
			 .map(name -> name + "-" +name.length())
			 .forEach(i -> System.out.println(i));
}
}