package com.skbh.main;


class RunnableService implements Runnable {
	volatile Integer count=new Integer(0);
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			throw new RuntimeException();
		} catch (InterruptedException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		for(int i=0;i<=5;i++){
			System.out.println(i + " :  " + ++count);
		}
		
	}
}

public class ThreadEx {

		public static void main(String[] args) {
			Thread.UncaughtExceptionHandler t=new Thread.UncaughtExceptionHandler(){

				@Override
				public void uncaughtException(Thread t, Throwable e) {
					 System.out.println(t + " Uncaught exception: " + e);
					
				}				
			};
			
			RunnableService r=new RunnableService();
			Thread t1 = new Thread(r);
			Thread t2 = new Thread(r);
			Thread t3 = new Thread(r);
			t1.setUncaughtExceptionHandler(t);
			t1.start();
			t2.start();
			t3.start();
			try {
				t1.join();
				t2.join();
				t3.join();
			} catch (InterruptedException exceptionObject) {
				
				exceptionObject.printStackTrace();
			}
			
			
			System.out.println("count=" + r.count);

		}


}
