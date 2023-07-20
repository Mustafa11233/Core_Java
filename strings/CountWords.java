package in.ashokit.strings;

public class CountWords {
	public static void main(String[] args) {
		
		String s = "    I love    java      programming   ";
		
//		int count =0;
//	    String[] word = s.split("\\s");
//	    
//	    for(int i=0;i<word.length;i++) {
//	    	if(word[i] != "") {
//	    	 
//	    	  count++;
//	    	}    
//	    }
//	 
//	    	System.out.println("No Of words are::"+count);
//	    
		
		String[] name = s.trim().split("\\s+");
		
		System.out.println(name.length);
	}

}
