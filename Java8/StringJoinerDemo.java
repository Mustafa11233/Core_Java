package in.ashokit.Java8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-");
		
		sj.add("ashok");
		sj.add("it");
		sj.add("java");
		
		System.out.println(sj); //ashok-it-java
		
		StringJoiner sj1 =new StringJoiner("-","(",")");
		

		sj1.add("ashok");
		sj1.add("it");
		sj1.add("java");
		
		System.out.println(sj1);//(ashok-it-java)
		
	}
}
