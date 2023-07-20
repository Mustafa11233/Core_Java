package in.ashokit;

public class YieldDemo {
	public static void main(int[] args) {}
	public static void main(String[] args) {
		Thread producer=new Producer();
		Thread consumer=new Consumer();
		producer.start();
		consumer.start();
		
		int[]arr= {1,2,3,34,44,45};
		for(int s:arr) {
		//System.out.println(main(arr));
		}
	}

}
class Producer extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Iam from producer class"+"==="+i);
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Iam from Consumer class"+i);
			Thread.yield();
		}
	}
}
