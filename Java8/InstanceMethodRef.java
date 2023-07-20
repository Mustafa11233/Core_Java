package in.ashokit.Java8;

public class InstanceMethodRef {
	
	public void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		
		InstanceMethodRef imf =new InstanceMethodRef();
		
		Runnable r = imf::m1;
		
		Thread t =new Thread(r);
		
		t.start(); 
		
	}
}
