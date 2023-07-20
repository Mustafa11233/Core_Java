package in.ashokit;

public class Student {
	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1=null;
		
		System.gc();
		Runtime.getRuntime().gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method called::");
	}

}
