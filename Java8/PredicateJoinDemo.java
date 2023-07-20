package in.ashokit.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;
	
	Employee(String name,String location,String dept){
		this.name=name;
		this.location=location;
		this.dept=dept;
	}
}

public class PredicateJoinDemo {
	public static void main(String[] args) {
		Employee e1=new Employee("Raju","Chenni","DEvOps");
		Employee e2=new Employee("Rani","Hyd","DEvOps");
		Employee e3=new Employee("Rajesh","Hyd","DB");
		Employee e4=new Employee("Ramesh","Banglore","Testing");
		Employee e5=new Employee("Rakesh","Hyd","DB");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		  Predicate<Employee> p1= e -> e.location.equals("Hyd");
		  Predicate<Employee> p2 =e -> e.dept.equals("DB");
		  
		  //Predicate Joining
		  Predicate<Employee> p = p1.and(p2);
		  
		  for(Employee emp : employees) {
			  if(p.test(emp)) {
				  System.out.println(emp.name);
			  }
		  }
		  
	
		
		
	}

}
