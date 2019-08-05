package com.skbh.main;

public class ThreadExample implements Runnable {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("unused")
	private int print(int a,int b){
		System.out.println("print method called");
		return a*b;
	}
	
	private  int  count=0;
	int n=0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +  " : " + ++count);
			System.out.println(Thread.currentThread().getName() + " # n = " + ++n);

	}

	public static void main(String[] args) {
		ThreadExample threadExample1 = new ThreadExample();
		/*threadExample.setName("T1");
		threadExample.start();
		threadExample1.start();
		threadExample1.setName("T2");*/
		Thread t1 = new Thread(threadExample1);
		t1.setName("R1");
		t1.start();
		Thread t2 = new Thread(threadExample1);
		t2.setName("R2");
		t2.start();

	}

}
