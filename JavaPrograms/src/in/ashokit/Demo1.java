package in.ashokit;

public class Demo1<T> {
	
	
	public void m1(T t) {
		System.out.println("m1 method called"+"====="+t);
	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.m1(10);
		d.m1("hi");
		d.m1(100.23);
		d.m1(true);
		
	}

}
