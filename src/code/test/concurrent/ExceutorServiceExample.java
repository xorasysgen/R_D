package code.test.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExceutorServiceExample {

	public static void main(String[] args) {
		
		Callable<Integer> c=new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int i=0,sum=0;
				for(;i<=500;i++) {
					sum+=i;
				}
				Thread.sleep(5000);
				return sum;
			}
		};
		ExecutorService pool=Executors.newFixedThreadPool(1);
		
		Future<Integer> i= (Future<Integer>) pool.submit(c);
		try {
			System.out.println(i.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		Callable<Integer> c1=new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int i=0,sum=0;
				for(;i<=500;i++) {
					sum+=i;
				}
				Thread.sleep(5000);
				return sum;
			}
		};
		Future<Integer> i2= (Future<Integer>) pool.submit(c1);
		try {
			System.out.println(i2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("sfsadf");
		

	}

}
