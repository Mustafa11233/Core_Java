package in.ashokit.Interviews;

public class ObjectData {
	public static void main(String[] args) {
		ObjectData d=new ObjectData();
		
		Person2 person = d.get(101);
		System.out.println(person.id+"==="+person.name+"====="+person.age);
	}

	Person2 get(int id) {
		Person2 p=new Person2();
		if(id==101) {
		p.id=101;
		p.name="Raju";
		p.age=30;
		}else {
		p.id=102;
		p.name="Rani";
		p.age=32;
		}
			return p;
	}
		
	}

class Person2{
	int id;
	String name;
	int age;
}