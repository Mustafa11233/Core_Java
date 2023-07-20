package in.ashokit;

public class Student extends User{
	

	
	double d;
	public Student() {
		System.out.println("Student class :: Constructor");
	}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
		//parent class variables initilizing child calss object reff variable.
		s.id=1;
		s.name="Raju";
		//child class object ref variable initilizing with its own object
		s.d=22.0;
		
		System.out.println(s.id+"======="+s.d+"====="+s.name);
	}

}
