package com.skbh.main;


import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

class Exe implements Runnable {
Object cl;
	@Override
	protected void finalize() throws Throwable {
		try{
			System.out.println("Finalized called before garbage collector$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Finalize of Sub Class");
            throw new  RuntimeException("runtime exception:");
        }catch(Throwable t){
            throw t;
        }finally{
            System.out.println("Calling finalize of Super Class");
            super.finalize();
        }

	}
	final Semaphore semaphore=new Semaphore(5);
	public void run() {
		new String("anc");
		new String("jkk");
		new String("23");
		new String("fsdf@#$@$");
		
		for(int i=10;i<=25;i++){
			try {
				semaphore.acquire();
			} catch (InterruptedException exceptionObject1) {
				exceptionObject1.printStackTrace();
			}
			System.out.println(i + Thread.currentThread().getName()+  " running");
			try {
				Thread.sleep(50);
			} catch (InterruptedException exceptionObject) {
				exceptionObject.printStackTrace();
			}
			
			semaphore.release();
		}
	}
}
	

public class DaemonThread {
	
	@Override
	protected void finalize() throws Throwable {
		try{
			System.out.println("Finalized called before garbage collector$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Finalize of Sub Class");
            throw new  Exception("runtime exception:");
        }catch(Throwable t){
            throw t;
        }finally{
            System.out.println("Calling finalize of Super Class");
            super.finalize();
        }

	}

	public static void main(String[] args) {
		final Semaphore semaphore=new Semaphore(2);
		WeakHashMap<Long, Long> weak=new WeakHashMap<Long, Long>();
		for(long i=0;i<10000;i++){
			weak.put(new Long(i), i);
		}
		System.out.println("Size of weak hash map before GC=" + weak.size());
		
		Thread th=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<=10;i++){
					try {
						semaphore.acquire();
					} catch (InterruptedException exceptionObject1) {
						// TODO Auto-generated catch block
						exceptionObject1.printStackTrace();
					}
					System.out.println(i + " Deamon Thread "+ Thread.currentThread().getName());
					try {
						Thread.sleep(50);
					} catch (InterruptedException exceptionObject) {
						exceptionObject.printStackTrace();
					}
					
					semaphore.release();
				}
				
			}
			
		});
		
		
		Thread th0=new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<=10;i++){
					try {
						semaphore.acquire();
						if(i==7){
							System.out.println("Sleeping for 2 seconds...");
							Thread.sleep(10000);
							throw new InterruptedException("Interrupted...");
						}
					} catch (InterruptedException exceptionObject1) {
						// TODO Auto-generated catch block
						exceptionObject1.printStackTrace();
					}
					System.out.println(i + " Deamon Thread "+ Thread.currentThread().getName());
					try {
						Thread.sleep(50);
					} catch (InterruptedException exceptionObject) {
						exceptionObject.printStackTrace();
					}
					
					semaphore.release();
				}
				
			}
			
		});
		
		Exe e=new Exe();
		Thread th1=new Thread(e);
		th1.start();
		th1.setName("User Thread 1");
		Thread th2=new Thread(e);
		Thread th3=new Thread(e);
			
		th.setDaemon(true);
		th0.setDaemon(true);
		th.start();
		th.setName("TH");
		th0.start();
		th0.setName("TH0");
		th2.start();
		th2.setName("User Thread 2");
		th3.start();
		th3.setName("User Thread 3");
		try {
			th.join();
			th1.join();
			th0.join();
			
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		System.gc();
		System.out.println("System.gc();-----------------------------------------");
		System.out.println("Size of weak hash map After GC=" + weak.size());
	
		
	}

}

