package in.ashokit;

public class Demo2<T> {
	
	T obj;
	
	void add(T obj) {
		this.obj=obj;
		
	}
	T get() {
		return obj;
	}
	public static void main(String[] args) {
		Demo2<Integer> d1=new Demo2<>();
		d1.add(1);
		System.out.println(d1.get());
		
		Demo2<String> d2=new Demo2<>();
		d2.add("Hai");
		System.out.println(d2.get());
	}
	

}
