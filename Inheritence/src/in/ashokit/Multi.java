package in.ashokit;

public class Multi extends Thread {
	
	
	public void run() {
		System.out.println("my thread Started::");
		System.out.println("Iam from run() method");
		System.out.println("my thread ended");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is main method started::");
		Multi m=new Multi();
		Thread t=new Thread(m);
		t.start();
		System.out.println("This is main method ended::");
		
	}

}
