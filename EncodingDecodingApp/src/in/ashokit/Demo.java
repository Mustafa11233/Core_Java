package in.ashokit;

import java.security.MessageDigest;
import java.util.Base64;

public class Demo {
	public static void main(String[] args) throws Exception {
		
	
	
	String str = "abc@123";
	
	/*
	 * Encoder encoder = Base64.getEncoder();
	 * 
	 * String encodedStr = encoder.encodeToString(str.getBytes());
	 * 
	 * System.out.println(encodedStr);
	 * 
	 * Decoder decoder = Base64.getDecoder();
	 * 
	 * byte[] decode = decoder.decode(encodedStr);
	 * 
	 * System.out.println(new String(decode));
	 */
	
	MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
	
	msgDigest.reset();
	
	msgDigest.update(str.getBytes());
	
	byte[] encryptedTxt = msgDigest.digest();
	
	System.out.println(new String(encryptedTxt));
	
	String encoded = Base64.getEncoder().encodeToString(encryptedTxt);
	
	System.out.println(encoded);
	
	}
}
