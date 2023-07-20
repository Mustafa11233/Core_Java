package in.ashokit;

public class Multi2 implements Runnable{
	
	public void run() {
		System.out.println("Iam run() method start::"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Iam run() method end::"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Multi2 n=new Multi2();
		Multi2 n1=new Multi2();
		Multi2 n2=new Multi2();
		Thread t=new Thread(n);
		
		t.setPriority(Thread.MAX_PRIORITY);
		t.setName("Thread-0");
		Thread t1=new Thread(n1);
		t1.setPriority(7);
		t1.setName("Thread-1");
		Thread t2=new Thread(n2);
		t2.setPriority(6);
		t2.setName("Thread-2");
		
		
		t.start();
		t1.start();
		t2.start();
		
		
	}

}
