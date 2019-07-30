package code.test.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class Invoker implements Executor{

	@Override
	public void execute(Runnable command) {
		command.run();
		
	}
	
} 



public class ExecutorInvoker {
	
	public static void main(String[] args) {
		Executor executor=new Invoker();
		try {
			executor.execute(()-> {
				int sum=0;
				for (int i = 0; i < 100000; i++) {
					sum=sum+i;				
				}
				System.out.println("Sum#" + sum);
			});
		}
		catch(RejectedExecutionException e) {
			e.printStackTrace();
		}

	}

}
