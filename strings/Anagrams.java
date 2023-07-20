package in.ashokit.strings;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		
		String str1= "run";
		String str2= "unr";
		
		if(str1.length() != str2.length()) {
			System.out.println("Given String is not a Anagram");
		}
		
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.equals(a,b));
		
		}

}
