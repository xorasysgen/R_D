package code.test.concurrent;

import java.util.LinkedList;
import java.util.List;

 class BlockingQueueModel implements Runnable{

	 private List<Integer> queue = new LinkedList<Integer>();
	  private int  limit = 10;

	  public BlockingQueueModel(int limit){
	    this.limit = limit;
	  }


	  public synchronized void enqueue(Object item)
	  throws InterruptedException  {
	    while(this.queue.size() == this.limit) {
	      wait();
	    }
	    if(this.queue.size() == 0) {
	      notifyAll();
	    }
	    this.queue.add((Integer) item);
	  }


	  public synchronized Object dequeue()
	  throws InterruptedException{
	    while(this.queue.size() == 0){
	      wait();
	    }
	    if(this.queue.size() == this.limit){
	      notifyAll();
	    }

	    return this.queue.remove(0);
	  }
	
	
	@Override
	public void run() {
		System.out.println(3);
		
	}
}
 
 
 public class BlockingQueueNative{
	 
	 public static void main(String[] args) {
			
		  final BlockingQueueModel blockingQueueNative=new BlockingQueueModel(2);
		 Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					blockingQueueNative.enqueue(5);
					blockingQueueNative.enqueue(15);
					blockingQueueNative.enqueue(35);
					blockingQueueNative.enqueue(55);
					blockingQueueNative.enqueue(65);
				} catch (InterruptedException exceptionObject) {
					// TODO Auto-generated catch block
					exceptionObject.printStackTrace();
				}
				
			}
			 
		 });
		 
		 t.start();
		 
		 Thread t1=new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						blockingQueueNative.dequeue();
						blockingQueueNative.dequeue();
						blockingQueueNative.dequeue();
					} catch (InterruptedException exceptionObject) {
						// TODO Auto-generated catch block
						exceptionObject.printStackTrace();
					}
					
				}
				 
			 });
			 
			 t1.start();
			
	}
	 
 }
