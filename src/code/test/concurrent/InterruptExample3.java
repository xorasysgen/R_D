package code.test.concurrent;

import java.util.concurrent.Callable;

public class InterruptExample3 {
	
	static class Task implements Callable<Object>{

		@Override
		public Integer call() {
			int i=0;
			for(;i<=100000;) {
				System.out.println(Thread.currentThread().getName() + " Running Id # " + i++);
				if(Thread.interrupted()) {
					System.out.println("Thread Interrupted........................\n \n \n \n \n");
						try {
							throw new InterruptedException("Thread Interrupted");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
			}
			return 0;
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		new InterruptExample3.Task().call();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new InterruptExample3.Task().call();
		
		Callable<Integer> t=new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				System.out.println("call");
				return null;
			}
			
		};
		try {
			t.call();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
      
	}

}
