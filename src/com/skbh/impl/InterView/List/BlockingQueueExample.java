package com.skbh.impl.InterView.List;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue<Integer> bq=new ArrayBlockingQueue<Integer>(5);
		try {
			bq.put(10);// add and put to insert
			bq.put(11);
			bq.put(12);
			bq.put(13);
			bq.put(14);
			bq.put(15);
			bq.put(16); //  block untill remove 
		} catch (InterruptedException exceptionObject) {
				exceptionObject.printStackTrace();
		}
		
		System.out.println(bq);
		

	}

}
