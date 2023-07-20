package in.ashokit.samplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpPf {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Enter Basic Salary of Yours");
	   String basicSalary = br.readLine();
	   double parseDouble = Double.parseDouble(basicSalary);
	   double pf = parseDouble*12/100;
	   
	   
	   System.out.println("Employee pf amount based on basic Salary::"+basicSalary+"="+pf);
	}

}
