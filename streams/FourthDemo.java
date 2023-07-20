package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FourthDemo {
	public static void main(String[] args) {
		
		List<String> java = Arrays.asList("core java","adv java","springBoot");
		
		List<String> ui = Arrays.asList("Html","CSS","bs");
		
		List<List<String>> courses = Arrays.asList(java,ui);
		
		//courses.stream().forEach(i  -> System.out.println(i));
		
		Stream<String> flatMap = courses.stream().flatMap(s -> s.stream());
		
		flatMap.forEach(i -> System.out.println(i));
	}

}
