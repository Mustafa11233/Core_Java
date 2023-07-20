package in.ashokit;

public class Multi6 {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
				System.out.println("Iam run method()"+Thread.currentThread().getName()+"=="+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		};
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
				System.out.println("Iam run method()"+Thread.currentThread().getName()+"=="+i);
				try {
					Thread.sleep(1000);
					//yield method will give change to other thread to execute parallely
					Thread.yield();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		};
		t.setName("Thread -0");
		t.start();
		//join method will hold other thread to execute for execution
		//first it will allow thread to execute current thread then it will give chance to execute other 
		//thread after execution current thread
		//t.join();
		t1.start();
		
	
	}

}
