package in.ashokit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -1001;

	int id;
	String name;
	int age;
	
	
	static String email;
	transient String pwd;

	public static void main(String[] args) throws Exception {

		System.out.println("========Serialization Started========");

		Person p1 = new Person();
		p1.id = 10;
		p1.name = "Raju";
		p1.age = 30;
		email = "mustafa.md.224@gmail.com";
		p1.pwd = "King";
		
		
		

		FileOutputStream fo = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(p1);
		oos.flush();
		oos.close();
		System.out.println("=======Serialization Compelete=======");
		System.out.println("=========De-Serialization===========");
		FileInputStream fi = new FileInputStream("person.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Object object = ois.readObject();
		Person p2 = (Person) object;
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.email);
		System.out.println(p2.pwd);
		ois.close();
		System.out.println("========De-Serialization=======");

	}

}
