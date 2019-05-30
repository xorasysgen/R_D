package code.test.thread;

public class Java8Thread {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("sushil");
			}
			
		}).start();
		
		new Thread(()->System.out.println("test")).start();

	}

}
