package code.test.concurrent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Play implements Runnable {

	private String URL;
	private Integer counter;
	private Set<Integer> listOfPrice;
	CountDownLatch countDown;
		
	
	public Play(String uRL, Integer counter, Set<Integer> listOfPrice,CountDownLatch countDown) {
		URL = uRL;
		this.counter = counter;
		this.listOfPrice = listOfPrice;
		this.countDown=countDown;
	}

	@Override
	public void run() {
		if(URL.equals("google")) {
			System.out.println("google service called");
			listOfPrice.add(11111);
		}
		else if(URL.equals("facebook")) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("facebook service called");
			listOfPrice.add(22222);
		}
		else if (URL.equals("amazon"))
			System.out.println("amazon service called");
			listOfPrice.add(44444);
		countDown.countDown();
		System.out.println("count down="+ countDown.getCount());
	}
	
		
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Integer getCounter() {
		return counter;
	}


	public void setCounter(Integer counter) {
		this.counter = counter;
	}


		
}


public class CountDownLatchParallelExample {

	public static void main(String[] args) throws InterruptedException {
		
		Set<Integer> priceList=Collections.synchronizedSet(new HashSet<Integer>());
		CountDownLatch countDown=new CountDownLatch(3);
		ExecutorService pool=Executors.newFixedThreadPool(4);
		pool.submit(new Play("google",1,priceList,countDown));
		pool.submit(new Play("facebook",2,priceList,countDown));
		pool.submit(new Play("amazon",3,priceList,countDown));
		countDown.await(6,TimeUnit.SECONDS);
		System.out.println(priceList);
		pool.shutdown();
		
		

	}

}
