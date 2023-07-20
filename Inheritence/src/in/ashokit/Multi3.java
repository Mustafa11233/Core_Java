package in.ashokit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Multi3 implements Callable{
	
	public Object call() {
		System.out.println("call() method executed::");
		return "Success";
		
	}
	public static void main(String[] args) throws Exception {
		Multi3 n=new Multi3();
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		for(int i=0;i<=15;i++) {
		        Future Submit = executorService.submit(n);
		        System.out.println(Submit.get().toString());
		}
		
		
		executorService.shutdown();
	}
	

}
