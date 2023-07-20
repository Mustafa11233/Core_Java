package in.ashokit.strings;

public class RemoveOwels {
	public static void main(String[] args) {
		
		String str = "Hello, i love my india";
		
		str=str.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(str);
	}

}
