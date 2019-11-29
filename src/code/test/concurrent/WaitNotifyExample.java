package code.test.concurrent;

class Calulator implements Runnable {

	private Integer count=0;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starting..");
		synchronized (this) {
			System.out.println("Calulating..." + Thread.currentThread().getName());
			for (int i = 0; i < 110000000; i++) {
						count += 1;
			}
		try {
			System.out.println(Thread.currentThread().getName() + "sleeping for 10 seconds...");
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Notifying...");
		//notify();
		}
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}


	
}

public class WaitNotifyExample {

	public static void main(String[] args) {
		Calulator cal=new Calulator();
		Thread th0=new Thread(() ->  {
			System.out.println(Thread.currentThread().getName() + " Starting..");
			synchronized (cal) {
				System.out.println("Calulating..." + Thread.currentThread().getName());
				for (int i = 0; i < 110000000; i++) {
					cal.setCount(cal.getCount() + 1);
				}
			try {
				System.out.println(Thread.currentThread().getName() + "sleeping for 10 seconds...");
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Notifying...");
			}
				
			
		});
		
		Thread th=new Thread(cal);
		th.setName("Th");
		th0.setName("Th0");
		
		th.start();
		th0.start();
		try {
			th.join();
			th0.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		synchronized(cal) {
			try {
				System.out.println("Main Thread Waiting...");
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Sum# " + cal.getCount());
		}
		
		
	}

}
