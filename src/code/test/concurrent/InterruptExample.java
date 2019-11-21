package code.test.concurrent;

public class InterruptExample {
	
	static class Task implements Runnable{

		@Override
		public void run() {
			int i=0;
			while(!Thread.interrupted()){
				System.out.println(Thread.currentThread().getName() + " Running Id # " + i++);
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		Thread th=new Thread(new InterruptExample.Task());
		th.setName("Th");
		th.start();
		
		Thread th1=new Thread(new InterruptExample.Task());
		th1.setName("Th1");
		th1.start();
		
		
		 try {
		        Thread.sleep(3000);
		    } catch (InterruptedException e) {}
		 
		    th.interrupt();
		    
		    try {
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {}
		    
		    th1.interrupt();
		    
      
	}

}
