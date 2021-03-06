package code.test.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	//private Integer count=new Integer(0);

	/*
	 * public void increment() { count++; }
	 * 
	 * public Integer getCount() { return count; }
	 */
	
	
	private AtomicInteger count=new AtomicInteger(0);

	public void increment() {
		count.getAndIncrement();
	}

	public Integer getCount() {
		return count.get();
	}

}
