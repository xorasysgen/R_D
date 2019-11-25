package code.test.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Task implements Runnable {

	private int i=0;
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			System.out.println(" I am alive untill interrupted " + i++);
		}
	}
	
	}


public class FutureTimedOutExample {
	
	public static void main(String[] args) {
		Task task=new Task();
		ExecutorService pool=Executors.newCachedThreadPool();
		Future<?> future=pool.submit(task);
		try {
			future.get(10, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			future.cancel(true);
			e.printStackTrace();
		}
		finally{
			pool.shutdown();
		}
		

	}

}
