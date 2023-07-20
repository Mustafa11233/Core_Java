package in.ashokit.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxEmployee {
	public static void main(String[] args) {
		
		
		Employee1 e1 = new Employee1(1,"Raju",25000.00);
		Employee1 e2 = new Employee1(2,"Abraham",16000.00);
		Employee1 e3 = new Employee1(3,"Sunil",15000.00);
		Employee1 e4 = new Employee1(4,"Shekar",35000.00);
		Employee1 e5 = new Employee1(5,"Krishna",55000.00);
		
	//	Stream<Employee1> stream = Stream.of(e1,e2,e3,e4,e5);
		
	// if we perform operation by creating a stream ,we cannot perform another operation on same stream,it will 
	// throw run time exception
		
		List<Employee1> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Optional<Employee1> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		
		System.out.println("Max Salary ::" + max.get().salary);
		
		Optional<Employee1> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		
		System.out.println("Min Salary ::"+ min.get().salary);
		
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		
		System.out.println("Average Salary ::" + avgSalary);
	}

}

 class Employee1{
	
	int id;
	String name;
	double salary;
	
	public Employee1(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}