package in.ashokit.samplePrograms;


public class Switch1 {
	public static void main(String[] args) {
		
//		Scanner r =new Scanner(System.in);
//		System.out.println("Enter Number");
//		int num = r.nextInt();
		
		
		
		//Switch is considering char as integer value so program is executing
		switch('a') {
		case 1: System.out.println("hi");
		
		case 'a':System.out.println("hello");
		
		default:System.out.println("Default");
		}
	}

}
