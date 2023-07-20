package in.ashokit.strings;

public class Swap1 {
	public static void main(String[] args) {
		
		String a ="java";
		String b ="program";
//		
//		a=a+b;
//		b=a+b;
//		
//		a=a.substring(4,11);
//		b=b.substring(0, 4);
//		
//		
//		System.out.println(a);
//		System.out.println(b);
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring( b.length());
		
		System.out.println(a);
		System.out.println(b);
	
	}

}
