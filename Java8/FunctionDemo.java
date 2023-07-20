package in.ashokit.Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String,Integer> f= (name) -> name.length();
		System.out.println(f.apply("ashokit"));
		System.out.println(f.apply("Hyd"));
		System.out.println(f.apply("Warangal"));
		
		System.out.println("================");
		
		BiFunction<Integer,Integer,Integer> bip=(a,b) -> (a+b);
		System.out.println(bip.apply(2,3));
		
	}

}
