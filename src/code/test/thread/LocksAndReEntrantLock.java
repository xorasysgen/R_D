package code.test.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksAndReEntrantLock  implements Runnable {

	private Counter count;
	
	public LocksAndReEntrantLock(Counter counter) {
		this.count=counter;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
		CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
		
		Counter Counter=new Counter();
		LocksAndReEntrantLock lock= new LocksAndReEntrantLock(Counter);
		LocksAndReEntrantLock lock1= new LocksAndReEntrantLock(Counter);
		Thread th=new Thread(lock);
		Thread th1=new Thread(lock1);
		Lock obj1=new ReentrantLock();
		obj1.lock();
		th.start();
		th.join();
		
		obj1.unlock();//unlock
		
		th1.start();
		th1.join();
		System.out.println(lock.getCount().getCount());
		
	}

	public Counter getCount() {
		return count;
	}

	public void setCount(Counter count) {
		this.count = count;
	}

	@Override
	public void run() {
		add();
	}

	
	private void add() {
		
		for(int i=0;i<10000;i++) {
			count.increment();
			}
	}


}
