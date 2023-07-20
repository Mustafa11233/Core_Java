package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThirdDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Raju", 25, 25000.00);
		Employee e2 = new Employee("Ravi", 35, 25000.00);
		Employee e3 = new Employee("Rakesh", 45, 55000.00);
		Employee e4 = new Employee("Arif", 27, 65000.00);
		Employee e5 = new Employee("Anjum", 22, 125000.00);
		Employee e6 = new Employee("Ramu", 65, 225000.00);
		Employee e7 = new Employee("Rahul", 20, 35000.00);
		Employee e8 = new Employee("Arun", 35, 625000.00);

		// List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5, e6, e7, e8);

//		emp.stream()
//			.filter(sal -> sal.salary >= 50000)
//			//.map(sal -> sal + "-"+sal.name+"-"+sal.age)
//			.forEach(i -> System.out.println(i));

//		stream.filter(e -> e.salary >= 50000).map(e -> e.name + "-" + e.age).forEach(i -> System.out.println(i));

		stream.filter(e -> e.salary>=50000)
		      .forEach(e -> System.out.println(e.name+"-"+e.age));
		
	}
}

class Employee {
	String name;
	int age;
	Double salary;

	Employee(String name, int age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}