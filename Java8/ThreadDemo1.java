package in.ashokit.Java8;

//Approach-1
public class ThreadDemo1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		ThreadDemo1 t = new ThreadDemo1();
		
		Thread t1 =new Thread(t);
		
		t1.start();
		
	}
}
