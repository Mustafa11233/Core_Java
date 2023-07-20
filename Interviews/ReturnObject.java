package in.ashokit.Interviews;

public class ReturnObject {
	public static void main(String[] args) {
		ReturnObject r=new ReturnObject();
		Person p1 = r.getPerson();
		System.out.println(p1.id+"=="+p1.age+"==="+p1.name+"==="+p1.salary);
	}
	
	
	Person getPerson() {
		Person p=new Person();
		p.id=101;
		p.name="Raju";
		p.age=25;
		p.salary=25000.00;
		
		return p;
	}

}
class Person{
	int id;
	String name;
	int age;
	Double salary;
}