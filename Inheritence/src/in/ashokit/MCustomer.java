package in.ashokit;

public class MCustomer {
	int amount =10000;
	
		synchronized void withDraw(int amount) {
			System.out.println("Going to withdraw");
			if(this.amount <amount) {
				System.out.println("less balance ;waiting for Deposit");
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.amount-=amount;
				System.out.println("withDraw Completed...");
			}
		}
			synchronized void deposit(int amount) {
				System.out.println("going to deposit");
				this.amount+=amount;
				System.out.println("deposit complete");
				notify();
			}
			
			
		
	
	
	
	

	
	public static void main(String[] args) {
		final MCustomer m=new MCustomer();
		
		new Thread(){
			@Override
			public void run() {
				m.withDraw(15000);
			}	
		}.start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread() {
			@Override
			public void run() {
				m.deposit(10000);
			}
		}.start();
		
	}
}
