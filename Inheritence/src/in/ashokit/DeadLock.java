package in.ashokit;

public class DeadLock {
	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hello";
		
		Thread t=new Thread() {
			@Override
			public void run() {
				synchronized(s1) {
					System.out.println("Thread -1 locked resource-1");
					try{
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(s2) {
						System.out.println("Thread-1 is waiting for resource-2");
					}
			}
			}
	
			};
			Thread t2=new Thread() {
				@Override
				public void run() {
					synchronized(s2) {
						System.out.println("Thread-2 locked resource-2");
						try{
							Thread.sleep(100);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						synchronized(s1) {
							System.out.println("Thread-2 is waiting for resource-1");
						}
					}
				}
			};
			t.start();
			t2.start();
		}
	
	
	}


