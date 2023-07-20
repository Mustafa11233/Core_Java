package in.ashokit.samplePrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		
		Scanner r =new Scanner(System.in);
		System.out.println("Enter Year");
		int year = r.nextInt();
		
		
		if(year%100 ==0 && year%400 == 0 || year%100!=0 && year%4==0) {
			System.out.println("given year is a leap year::"+year);
		}else {
			System.out.println("given year is a not a leap year::"+year);
		}
	}

}
