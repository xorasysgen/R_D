package code.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Calculator{
	
	private Integer sum=new Integer(0);
	
	public Integer add(Integer... number){
		for (Integer intValue : number) {
			sum+=intValue;			
		}
		return sum;		
		
	}
	
}


public class ThreadCallable {
	public static void main(String[] args) {
		ExecutorService service=Executors.newCachedThreadPool();
		Executors.newFixedThreadPool(2);
		Executors.newScheduledThreadPool(5);
		
		long start=System.currentTimeMillis();
		Future<Integer> futureType=service.submit(new Callable<Integer>(){
			@Override
			public Integer call() throws Exception {
				Calculator calculator=new Calculator();
				
				return calculator.add(12,4444,69,52);
			}
			
		});
		
		
		Future<Integer> futureType1=service.submit(()->{			
				return new Calculator().add(12,4444,69,52);
		});
			
		
		
		service.shutdown();
		long end=System.currentTimeMillis();
		try {
			System.out.println("Sum : " + futureType.get());
			System.out.println("Sum : " + futureType1.get());
			System.out.println("time consumed  : " + (end-start));
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		} catch (ExecutionException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}

	}

}
