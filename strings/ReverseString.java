package in.ashokit.strings;

public class ReverseString {
	public static void main(String[] args) {
		
		//String s="java";
		String s= args[0];
		
//		char[] cs = s.toCharArray();
//		
//		for(int i=cs.length-1;i>=0;i--) {
//			  System.out.print(cs[i]);
//			
//		}
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			    rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	}

}
