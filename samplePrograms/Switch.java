package in.ashokit.samplePrograms;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Number");
		int num = r.nextInt();
		
		switch(num) {
		case 1:System.out.println("Monday");
		       break;
		case 2:System.out.println("Tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4:System.out.println("Thrusday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
	   default: System.out.println("No Day found");
		}
	}

}
