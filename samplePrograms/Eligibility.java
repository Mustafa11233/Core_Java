package in.ashokit.samplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eligibility {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Salary");
	
		
		String data = br.readLine();
		double salary= Double.parseDouble(data);
		System.out.println("Enter age");
		String line = br.readLine();
		int age = Integer.parseInt(line);
		
		
		if(salary >= 100000 && age < 30) {
			System.out.println("You are Eligible for Marriage");
		}else {
			System.out.println("Not Eligible for Marriage");
		}
		
		
		
	}

}
