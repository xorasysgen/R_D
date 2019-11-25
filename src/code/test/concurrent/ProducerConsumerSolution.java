package code.test.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerSolution {
	int i = 0;

	public void producerAndConsumer() {
		BlockingQueue<Integer> bk = new ArrayBlockingQueue<Integer>(10);
		Thread producer = new Thread(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				try {
					bk.put(new Integer(i++));
					if (i == 100 || i == 500 || i == 1000 || i == 2000 || i == 5000) {
						System.out.println("Producer deleyed");
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				try {
					System.out.println(bk.take());
					if (i == 8000) {
						System.out.println("consumer deleyed");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();
		consumer.start();
		 try {
		        Thread.sleep(3000);
		    } catch (InterruptedException e) {}
		 
		 producer.interrupt();
		 consumer.interrupt();
		 System.out.println("All thread interrupted");

	}

	public static void main(String[] args) {
		new ProducerConsumerSolution().producerAndConsumer();

	}

}
