package code.test.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCount extends Thread {

	private Counter counter;
	private Semaphore semaphore;

	public ThreadCount(Counter counter,Semaphore semaphore) {
		this.counter = counter;
		this.semaphore=semaphore;

	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + " Acquired CPU");
			try {
				semaphore.acquire();
			} catch (Exception e) {
			} finally {
			semaphore.release();
			System.out.println(Thread.currentThread().getName() + " Released CPU");
		}
			counter.increment();
			semaphore.release();
		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		Semaphore semaphore=new  Semaphore(100);
		ThreadCount t1 = new ThreadCount(counter,semaphore);
		ThreadCount t2 = new ThreadCount(counter,semaphore);
		Lock lock1 = new ReentrantLock();
		lock1.lock();
		boolean cond1 = lock1.tryLock();
		if (cond1) {// try without waiting
			try {
				t1.start();
				t1.setName("T1");
				t1.join();

			} catch (InterruptedException exceptionObject) {
				// TODO Auto-generated catch block
				exceptionObject.printStackTrace();
			} finally {
				if (cond1)	lock1.unlock(); // to ensure we unlock
				

			}
		}

		lock1.lock();
		cond1 = lock1.tryLock();
		if (cond1) {// try without waiting
			try {
				t2.start();
				t2.setName("T2");
				t2.join();
			} catch (InterruptedException exceptionObject) {
				// TODO Auto-generated catch block
				exceptionObject.printStackTrace();
			} finally {
				if (cond1) 		lock1.unlock(); // to ensure we unlock

			}
		}
		
		

		/*
		 * synchronized(obj){ t1.start(); try { t1.join(); } catch (InterruptedException
		 * exceptionObject) { // TODO Auto-generated catch block
		 * exceptionObject.printStackTrace(); } }
		 * 
		 * synchronized(obj){ t2.start(); try { t2.join(); } catch (InterruptedException
		 * exceptionObject) { // TODO Auto-generated catch block
		 * exceptionObject.printStackTrace(); } }
		 */

		/*
		 * System.out.println("---------------------------------------------"); Lock
		 * lock1=new ReentrantLock(); lock1.lock(); t1.start(); try { t1.join(); } catch
		 * (InterruptedException exceptionObject) { exceptionObject.printStackTrace(); }
		 * lock1.unlock(); lock1.lock(); t2.start(); try { t2.join(); } catch
		 * (InterruptedException exceptionObject) { exceptionObject.printStackTrace(); }
		 * lock1.unlock();
		 * System.out.println("---------------------------------------------");
		 */
		System.out.println("Counter# " + counter.getCount());

	}

}
