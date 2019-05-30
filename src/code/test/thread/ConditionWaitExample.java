package code.test.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class  CounterMachine{
	
	private Integer count=new Integer(0);
	public void doIncrement() {
		for(int i=1;i<=10000;i++) {
		count++;
		}
	}
	
	public Integer getCount() {
		return count;
	}
	
}

public class ConditionWaitExample {
	
	private CounterMachine CounterMachine=new CounterMachine();
	private Lock lock=new ReentrantLock();
	private Condition cond=lock.newCondition();
	
	
	
	public void firstThread(){
		try {
			lock.lock();
			System.out.println("T1 Waiting...");
			cond.await();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exceptionObject) {
				exceptionObject.printStackTrace();
			}
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		CounterMachine.doIncrement();
		lock.unlock();
		
	}
	
	public void SecondThread(){
		try {
			Thread.sleep(30);
		} catch (InterruptedException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		lock.lock();
		cond.signal();
		CounterMachine.doIncrement();
		lock.unlock();
	}
	

	public CounterMachine getCounterMachine() {
		return CounterMachine;
	}

	public void setCounterMachine(CounterMachine counterMachine) {
		CounterMachine = counterMachine;
	}

	public static void main(String[] args) {
		final ConditionWaitExample conditionWaitExample=new ConditionWaitExample();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				conditionWaitExample.firstThread();
			}
			
		});
		
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				conditionWaitExample.SecondThread();
			}
			
		});
		t1.start();
		t2.start();
		
		try {
			t2.join();
			t1.join();
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		
		System.out.println("final count# " + conditionWaitExample.getCounterMachine().getCount());
		int a = 1;
		
		System.out.println(a++ + --a + ++a + a++ + --a - --a);
		System.out.println(a);

	}
}
