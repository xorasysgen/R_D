package com.skbh.main;

class Goal implements Runnable{

	@Override
	public void run() {
		Thread.yield();
		for(int i=0;i<=10;i++) {
			if(Thread.currentThread().getName().equalsIgnoreCase("Thread 1")) {
				System.out.println(Thread.currentThread().getName() + "#"+ i);
			}
			else 
				System.out.println(Thread.currentThread().getName() + "$"+ i);
		}
		
		
	} 

}


public class ThreadTest {

	public static void main(String[] args) {
		Goal g=new Goal();
		Thread th=new Thread(g);
		Thread th1=new Thread(g);
		th.setPriority(10);
		th.setName("Thread 1");
		th.setDaemon(true);
		th.start();
		
		th1.setPriority(1);
		th1.setName("Thread 2");
		th1.start();

	}

}
