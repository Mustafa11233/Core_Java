package in.ashokit;

public class Test{
	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setAcc(1234344343);
		
		acc.setName("Raju");
		
		long num=acc.getAcc();
		String name=acc.getName();
		System.out.println(num);
		System.out.println(name);
	}
	
}