package code.test.concurrent;


public class InterruptExample2 implements Runnable{

		@Override
		public void run() {
			int i=0;
			for(;i<=1000000;) {
				System.out.println(Thread.currentThread().getName() + " Running Id # " + i++);
				if(Thread.interrupted()) {
					System.out.println("Thread Interrupted");
						try {
							throw new InterruptedException("Thread Interrupted");
						} catch (InterruptedException e) {
							e.printStackTrace();
							return;
						}
				}
			}
			
			
		
	}
	
	

	public static void main(String[] args) {
		Thread th=new Thread(new InterruptExample2());
		th.setName("Th");
		th.start();
		
		Thread th1=new Thread(new InterruptExample2());
		th1.setName("Th1");
		th1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		    
		    th1.interrupt();
      
	}

}
