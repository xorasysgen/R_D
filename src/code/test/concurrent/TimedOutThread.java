package code.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TimedOutThread {

	
	public static void main(String[] args) {

		runThread();
		runFutureThread();
		
	}

	private static void runThread() {
		ExecutorService threadPool= Executors.newFixedThreadPool(3);
		threadPool.submit(()-> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("running...");
			}
		});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadPool.shutdownNow(); // works as a Thread.interrupt() 
	}

	
	private static void runFutureThread() {
		ExecutorService threadPool= Executors.newFixedThreadPool(2);
		Future<?> future=threadPool.submit(()-> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Switch over running...");
			}
		});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		future.cancel(true); // works as a Thread.interrupt() 
		threadPool.shutdown();
	}
}
