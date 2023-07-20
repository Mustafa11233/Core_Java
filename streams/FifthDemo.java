package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;

public class FifthDemo {
	public static void main(String[] args) {
		
		List<String> java = Arrays.asList("core java","adv java","springBoot");
		
		java.stream().limit(3).forEach(i -> System.out.println(i));
		
		java.stream().skip(2).forEach(j -> System.out.println(j));
		
		List<String> names = Arrays.asList("rakesh","rani","rani","guru","raja","rajesh");
		
		names.stream().distinct().forEach(k -> System.out.println(k));
		
		
		
	}

}
