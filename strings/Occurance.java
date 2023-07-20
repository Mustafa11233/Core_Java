package in.ashokit.strings;

public class Occurance {
	public static void main(String[] args) {
		
		String str = "java";
//		char[] charArray = str.toCharArray();
//		int count=0;
//		for(int i=0;i<charArray.length;i++) {
//			
//			
//			if(charArray[i]=='a') {
//				count++;
//			}
//			
//
//}
//		if(count == 2) {
//			System.out.print("2");
//		}
		
		char ch ='a';
		int count = 0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println(count);

	}
}	