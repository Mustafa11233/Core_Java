package in.ashokit.InterviewQstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
        
		emp.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emp.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emp.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emp.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emp.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emp.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		emp.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emp.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emp.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emp.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emp.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emp.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		emp.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emp.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emp.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emp.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
	System.out.println("How many male and female employees are there in the organization ?");
//		Map<String, Long> map1 = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		
//		System.out.println(map1);
		
		System.out.println("Print the name of all departments in the organization ?");
//		emp.stream()
//		   //.map(e -> e.department)
//		   .map(Employee::getDepartment)
//		   .distinct()
//		   .forEach(name -> System.out.println(name));
		System.out.println("What is the average age of male and female employees ?");
//		Map<String, Double> collect = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		   System.out.println(collect);
		System.out.println("Get the details of highest paid employee in the organization ?");
		
//		Optional<Employee> optional = emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//		if(optional.isPresent()) {
//			System.out.println(optional.get().salary);
//	}
		System.out.println("Get the names of all employees who have joined after 2015 ?");
		
//		emp.stream().filter(e -> e.getYearOfJoining()>2015)
//		   .map(e -> e.name)
//		   .forEach(name -> System.out.println(name));
		System.out.println("Count the number of employees in each department ?");
//		Map<String, Long> map2 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(map2);
		System.out.println("What is the average salary of each department ?\r\n"
				+ "");
//		Map<String, Double> map3 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//	   System.out.println(map3);
	   System.out.println("=================");
//	   Optional<Employee> optional = emp.stream()
//	      .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
//	      .min(Comparator.comparing(Employee::getAge));
//	   if(optional.isPresent()) {
//		   System.out.println(optional.get().name);
//	   }
	   System.out.println("==============");
	   
//	   Optional<Employee> optional = emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
//	   if(optional.isPresent()) {
//		   System.out.println(optional.get().name);
//	   }
	   System.out.println("===============");
//	   Map<String, Long> map5 = emp.stream()
//	      .filter(e -> e.getDepartment().equals("Sales"))
//	      .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//	   System.out.println(map5);
	   System.out.println("===============");
	   //get the employee who is having second highest salary
	   //sort emps based on salary descending order then skip first record
//	   Optional<Employee> findFirst = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//	   if(findFirst.isPresent()) {
//		   System.out.println(findFirst.get());
//	}
		   
		   System.out.println("=========================");
//		   List<Employee> collect = emp.stream()
//		      .sorted(Comparator.comparing(Employee::getSalary).reversed())
//		      .collect(Collectors.toList());
//		   System.out.println(collect.get(1));
		   
		   System.out.println("=================");
	   }
	   
		}
	

class Employee
{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
    
}