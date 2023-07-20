package in.ashokit.Interviews;

public class Driver1 {
	public static void main(String[] args) {
		Driver1 d1=new Driver1();
		Doctor d=new Doctor();
		d.name="Raju";
		d.specialization="Heart Specilist";
		d1.print(d);
		
	}




void print(Doctor d) {
	System.out.println(d.name+"========"+d.specialization);
	
}

	
}

class Doctor{
	String name;
	String specialization;
}