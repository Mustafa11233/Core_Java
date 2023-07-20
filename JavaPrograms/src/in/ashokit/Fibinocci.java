package in.ashokit;

public class Fibinocci {
	public static void main(String[] args) {
		
		int firstNum=0;
		int secNum=1;
		int nextNum=0;
		
		for(int i=1;i<=50;i++) {
			System.out.println(firstNum);
			nextNum=firstNum+secNum;
			firstNum=secNum;
			secNum=nextNum;
		}
		
	}

}
