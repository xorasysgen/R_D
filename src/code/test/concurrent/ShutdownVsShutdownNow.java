package code.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;

public class ShutdownVsShutdownNow {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
	    executor.submit(new Runnable() {

	        @Override
	        public void run() {
	            while (true) {
	            	System.out.println("running" + new DateTime());
	                if (Thread.currentThread().isInterrupted()) {
	                    System.out.println("interrupted");
	                    break;
	                }
	            }
	        }
	    });

	    executor.shutdown();
	    //executor.shutdownNow();
	    try {
			if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS)) {
			    System.out.println("Still waiting after 10ms: calling System.exit(0)...");
			    System.exit(0);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("Exiting normally...");

	}

}
