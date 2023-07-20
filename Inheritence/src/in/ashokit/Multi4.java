package in.ashokit;

public class Multi4 implements Runnable {
	
	
	public synchronized void print() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"=="+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("======");
		}
	}
	public void run() {
		print();
	}
	public static void main(String[] args) {
		Multi4 m=new Multi4();
		Thread t=new Thread(m);
		t.start();
		Thread t1=new Thread(m);
		t1.start();
		
	}

}
