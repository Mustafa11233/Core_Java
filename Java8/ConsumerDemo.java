package in.ashokit.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String> c = (name) -> System.out.println(name+ ", Good Evening");
		c.accept("Ashok");
		c.accept("Pardhu");
		c.accept("Mustafa");
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		//for loop
		//for each loop
		//iterator
		//list iterator
		
		list.forEach(i -> System.out.println(i));
		
}

}