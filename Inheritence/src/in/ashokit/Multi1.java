package in.ashokit;

public class Multi1 extends Thread{

	public void run() {
		System.out.println("my thread Started::");
		m1();
		System.out.println("Iam from run() method");
		System.out.println("my thread ended");
	}
	void m1() {
		System.out.println("Iam from m1() method::");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is main method started::");
		Multi1 m=new Multi1();
		Thread t=new Thread(m);
		t.start();
		System.out.println("This is main method ended::");
		
	}

}
