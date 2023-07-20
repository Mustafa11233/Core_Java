package in.ashokit;

public class Employee {
	
	public Employee() {
		System.out.println("Employee::Constructor");
	}
	
	private void m1() {
		System.out.println("Iam from m1() method:;");
	}
	
	public void m2() {
		m1();
	}

}

