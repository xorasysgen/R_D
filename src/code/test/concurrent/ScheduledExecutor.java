package code.test.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.management.InstanceNotFoundException;
import javax.management.MalformedObjectNameException;
import javax.management.ReflectionException;

class callableTest implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int c=0;
		for(int i=0;i<=100;i++) {
			c=c+i;
		}
		
		return c;
	}
	
}

class Scheduler  implements Runnable{

	@Override
	public void run() {
		System.out.println("Running finised new ScheduledThreadPool after 15 few seconds");
	}
	
}

public class ScheduledExecutor {

	private static void SystemInfo() throws MalformedObjectNameException, NullPointerException, InstanceNotFoundException, ReflectionException {
		System.out.println("-----------------------------------------");
		int cpus = Runtime.getRuntime().availableProcessors();
		Long l=Runtime.getRuntime().freeMemory();
		System.out.println("CPU avail :" + cpus);
		System.out.println("Memory avail :" + l);
		System.out.println("-----------------------------------------");
		
	} 
	
	public static void scheduledExecutorService(ScheduledExecutorService ftses){
		
		
		
		ScheduledFuture<?> future=ftses.scheduleAtFixedRate(() -> {
	        System.out.println("scheduleAtFixedRate working"); 
		}, 1, 5, TimeUnit.SECONDS);



		ScheduledFuture<?> future1=ftses.scheduleWithFixedDelay(() -> {
	     System.out.println("FixedDelay working");try {
			SystemInfo();
		} catch (MalformedObjectNameException | InstanceNotFoundException | NullPointerException
				| ReflectionException e) {
			e.printStackTrace();
		}
	     }, 5, 10, TimeUnit.SECONDS);
		
		try {
			ftses.awaitTermination(30, TimeUnit.SECONDS);
			future.cancel(true);
			future1.cancel(true);
			ftses.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scheduler excutorImpl= new Scheduler();
		ScheduledExecutorService ftses =Executors.newScheduledThreadPool(0);
		System.out.println("Running started new ScheduledThreadPool");
		ftses.schedule(excutorImpl, 10, TimeUnit.SECONDS);
		
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		executorService.shutdown();
		ex.shutdown();
		
		
		ExecutorService exService=Executors.newFixedThreadPool(2);
		Callable<Integer> c=new callableTest();
		Future<Integer> f =exService.submit(c);
		try {
			Integer result=f.get();
			System.out.println("result#" + result);
		} catch (InterruptedException | ExecutionException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		exService.shutdown();

		ScheduledExecutor.scheduledExecutorService(ftses);
	}

}
