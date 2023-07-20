package in.ashokit.samplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum {
	
	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Number");
		
		String line = br.readLine();
		int num = Integer.parseInt(line);
		
		int i,count=0;
		
		for(i=1;i<=num;i++) {
			
			if(num % i == 0) {
				count++;  
			}
		}
		if(count == 2) {
			System.out.println("given number is a prime number ::"+num);
		}else {
			System.out.println("given number is a not a prime Number::"+num);
		}
		
	}

}
