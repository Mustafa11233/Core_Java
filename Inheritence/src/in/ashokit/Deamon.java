package in.ashokit;

public class Deamon implements Runnable {

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		if(currentThread.isDaemon()) {
			System.out.println("This is a Deamon Thread");
		}else {
			System.out.println("Normal Thread");
		}
		
	}
	public static void main(String[] args) {
		Deamon d=new Deamon();
		Thread t=new Thread(d);
		
		//t.setDaemon(true);
		t.start();
	}
	
	

}
