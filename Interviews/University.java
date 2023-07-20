package in.ashokit.Interviews;

public class University {
	
	
	int id;
	String name;
	public static void main(String[] args) {
		University u = m1(101);
		System.out.println(u.id+"-===="+u.name);
		u.m2();
	}
	
	void m2() {
		System.out.println("Just Say hai::");
	}
	
	
	static University m1(int id) {
		University u=new University();
		if(id==101) {
			u.id=101;
			u.name="bies";
		}else if(id==102) {
			u.id=102;
			u.name="vaggdevi";
		}
		return u;
	}

}
