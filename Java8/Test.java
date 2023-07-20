package in.ashokit.Java8;

import java.util.function.Supplier;

public class Test {
	
	public static void main(String[] args) {
		//Doctor d =new Doctor();
		
		Supplier<Doctor> s = Doctor::new;
		//Doctor doctor = s.get();
		System.out.println(s.get().hashCode() );
		
	}

}

class Doctor{
	public Doctor() {
		System.out.println("Doctor Constructor");
	}
}