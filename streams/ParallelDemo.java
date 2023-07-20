package in.ashokit.streams;

import java.util.stream.Stream;

public class ParallelDemo {
	public static void main(String[] args) {
		
		System.out.println("===========Serial Stream===========");
		
		Stream<Integer> s = Stream.of(1,2,3,4);
		s.forEach(i -> System.out.println(i +" :: "+ Thread.currentThread()));
		
		
		
		System.out.println("==========Parallel Stream=======");
		
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		of.parallel().forEach(i -> System.out.println(i+"::"+Thread.currentThread() ));
	}

}
