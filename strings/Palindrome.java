package in.ashokit.strings;

public class Palindrome {
	public static void main(String[] args) {

		String str = "madam";

//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		
//				String	s1=sb.toString();
//
//		if (str.equals(s1)) {
//		System.out.println("given String is a Palendrome:");
//		} else {
//			System.out.println("Not a Palindrome");
//		}

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not a palindrome");
		}
	}

}
