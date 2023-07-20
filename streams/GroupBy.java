package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
	public static void main(String[] args) {
		
		Employe1 e1 = new Employe1(1,"Raju",25000.00,"India");
		Employe1 e2 = new Employe1(2,"Abraham",16000.00,"India");
		Employe1 e3 = new Employe1(3,"Sunil",15000.00,"Spain");
		Employe1 e4 = new Employe1(4,"Shekar",35000.00,"Spain");
		Employe1 e5 = new Employe1(5,"Krishna",55000.00,"Australia");
		
		List<Employe1> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Map<String, List<Employe1>> data = list.stream()
		             .collect(Collectors.groupingBy(e -> e.country));
		
		
		System.out.println(data);
		
	}

}
class Employe1{
	
	int id;
	String name;
	double salary;
	String country;
	
	public Employe1(int id,String name,double salary,String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
		
	}

	@Override
	public String toString() {
		return "Employe1 [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}

}