package code.test.concurrent;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer implements Runnable{

	private BlockingQueue<Integer> bk;
	 
	public Producer(BlockingQueue<Integer> bk) {
		 this.bk=bk;
	 }
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				System.out.println(Thread.currentThread().getName() + " Producer : " + i);
				bk.put(i);
				
			} catch (InterruptedException exceptionObject) {
				// TODO Auto-generated catch block
				exceptionObject.printStackTrace();
			}
		}
		
	}
	
}


class Consumer implements Runnable{

	private BlockingQueue<Integer> bk;
	 
	public Consumer(BlockingQueue<Integer> bk) {
		 this.bk=bk;
		 
	 }
	
	@Override
	public void run() {
	while(true) {
		try {
		
			Integer i=bk.take();
			System.out.println(Thread.currentThread().getName() + " Consumner : " + i);
			
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
	}
		
	}
	
}



public class BlockingQueueTest {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> bk=new ArrayBlockingQueue<>(1);
		
		Thread t1=new Thread(new Producer(bk));
		t1.setName("T1");
		Thread t2=new Thread(new Producer(bk));
		t2.setName("T2");
		Thread t3=new Thread(new Consumer(bk));
		t3.setName("T3");
		
		
	/*	t1.start();
		t2.start();
		t3.start();*/
		
		System.gc();
		Runtime.getRuntime().gc();
	
		
		File file1=new File("C:\\Users\\Admin\\Desktop\\wordcount.java");
		try {
			Desktop.getDesktop().open(file1);
		} catch (IOException  exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		LinkedList s=new LinkedList();
		ArrayList ss=new ArrayList();
		for (int i =1; i < 10; i++) {
			s.add(i);
			ss.add(i);			
		}
		s.add(90);
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println(ss.get(2));
		Iterator it=s.listIterator(5);
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
			
		}
		
	}
	
	

}
