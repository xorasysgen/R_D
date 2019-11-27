package code.test.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;

class TimeOutObject implements Runnable {
	private AtomicBoolean atomic=new AtomicBoolean(true);
	
	@Override
	public void run() {
		while(atomic.get()==true) {
			System.out.println("Running...");	
		}
		
	}
	
	public void  stop() {
		atomic.getAndSet(false);
	}
	
	
}

public class TimeoutThreadUsingAtomic {

	public static void main(String[] args) {
		TimeOutObject t=new TimeOutObject();
		Thread th=new Thread(t);
		th.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.stop();
		

	}

}
