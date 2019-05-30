package code.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

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

class ExcutorImpl  implements Runnable{

	@Override
	public void run() {
		System.out.println("Running finised new ScheduledThreadPool after 15 few seconds");
	}
	
}

public class ExcutorFramework {

	public static void main(String[] args) {
		ExcutorImpl excutorImpl= new ExcutorImpl();
		ScheduledExecutorService ftses =
				Executors.newScheduledThreadPool(1);
		System.out.println("Running started new ScheduledThreadPool after 15 few seconds");
		ftses.schedule(excutorImpl, 15, TimeUnit.SECONDS);
		ftses.shutdown();
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		ex.execute(()-> {
			System.out.println("runnable class");
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
			});
		

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});

		executorService.shutdown();
		ex.shutdown();
		Runtime rt = Runtime.getRuntime();
		int cpus = rt.availableProcessors();
		System.out.println(cpus);
		
		ExecutorService exService=Executors.newFixedThreadPool(2);
		Callable<Integer> c=new callableTest();
		Future<Integer> f =exService.submit(c);
		try {
			Integer result=f.get();
			System.out.println("result" + result);
		} catch (InterruptedException | ExecutionException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		exService.shutdown();

		System.out.println(ThreadLocalRandom.current().nextInt());

		ForkJoinPool fjPool = new ForkJoinPool();
		fjPool.getFactory();

	}

}
