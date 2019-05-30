package com.skbh.main;

import java.util.concurrent.Semaphore;

class MyThread implements Runnable {

	private Semaphore semaphore;

	MyThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " Acquired CPU");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		} catch (InterruptedException ie) {
		} finally {
			semaphore.release();
			System.out.println(Thread.currentThread().getName() + " Released CPU");
		}
	}
}
	public class SemaphoreTest {
			public static void main(String args[]) {
			      Semaphore semaphore=new Semaphore(2);
			      MyThread mt1 = new MyThread(semaphore);
			      MyThread mt2 = new MyThread(semaphore);
			      MyThread mt3 = new MyThread(semaphore);
			      MyThread mt4 = new MyThread(semaphore);
			      MyThread mt5 = new MyThread(semaphore);
			      MyThread mt6 = new MyThread(semaphore);
			   
			      new Thread(mt1).start();
			      new Thread(mt2).start();
			      new Thread(mt3).start();
			      new Thread(mt4).start();
			      new Thread(mt5).start();
			      new Thread(mt6).start();
			      
		}
	}
