package in.ashokit.Interviews;

public class ObjectReference {
	public static void main(String[] args) {
		ObjectReference o =new ObjectReference();
		Employee e=new Employee();
		e.id=101;
		e.salary=80000.00;
		o.print(e);
		
		
		
			
		}
	void print(Employee e) {
		System.out.println(e.id +" "+e.salary);
		
	}

}
class Employee{
	int id;
	Double salary;
}