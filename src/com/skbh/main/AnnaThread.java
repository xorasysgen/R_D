package com.skbh.main;

public class AnnaThread {
	
	public static void threadProcessRegister(){
		for(int i=0;i<10;i++)
			System.out.println("Reg i = " + i );
	}
	
	public static void threadProcessLogin(){
		for(int i=0;i<10;i++)
			System.out.println("Lgi i = " + i );
	}
	
	

	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				threadProcessRegister();
				threadProcessLogin();
			}
		});
		
	Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				threadProcessLogin();
			}
		});
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		thread1.start();

	}

}
