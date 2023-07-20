package in.ashokit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multi5 {
	public static void main(String[] args) {
		
	
	
	Thread t=new Thread() {
		@Override
		public void run() {
			System.out.println("Iam from run() method:: logic-1");
		}
	};
	t.start();
	Runnable r=new Runnable() {
		@Override
		public void run() {
			System.out.println("Iam from run() method :: logic-2");
		}
	};
	Thread t1=new Thread(r);
	t1.start();
	Callable c=new Callable() {
		@Override
		public Object call() throws Exception {
			System.out.println("Iam from Call() method::");
			return "hai";
		}
	};
	ExecutorService exService = Executors.newFixedThreadPool(1);
	exService.submit(c);
	exService.shutdown();
	
	

}
}