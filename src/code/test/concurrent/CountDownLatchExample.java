package code.test.concurrent;

import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

import com.ui4j.api.util.LoggerFactory;

//https://www.polarsparc.com/xhtml/Synchronization.html
public class CountDownLatchExample {
	
	private static final Logger logger=Logger.getLogger(CountDownLatchExample.class);
	
    public static void main(String[] args) {
        final int COUNT = 3; // 3 Threads
        
        CountDownLatch latch = new CountDownLatch(COUNT);
        
        Thread as = new Thread(new AuthenticationService(latch));
        as.setName("AuthenticationServiceThread");
        
        Thread bs = new Thread(new AccountBalanceService(latch));
        bs.setName("AccountBalanceServiceThread");
        
        Thread fs = new Thread(new FraudService(latch));
        fs.setName("FraudServiceThread");
        
        System.out.printf("Initialization started ...\n");
        logger.info("test");
        
        as.start();
        bs.start();
        fs.start();
        
        try {
            latch.await();
        }
        catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        System.out.printf("Initialization completed !!!\n");
    }
    
    static class AuthenticationService implements Runnable {
        private final CountDownLatch latch;
        
        AuthenticationService(CountDownLatch latch) {
            this.latch = latch;
        }
        
        @Override
        public void run() {
            try {
            	logger.info("test");
                System.out.printf("Initializing authentication service ...\n");
                Thread.sleep(10000); // 2 seconds
                System.out.printf("Authentication service ready !!!\n");
                latch.countDown();
                System.out.println("authentication latch count " + latch.getCount());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class AccountBalanceService implements Runnable {
        private final CountDownLatch latch;
        
        AccountBalanceService(CountDownLatch latch) {
            this.latch = latch;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Initializing account balance service ...\n");
                Thread.sleep(10000); // 2 seconds
                System.out.printf("Account balance service ready !!!\n");
                latch.countDown();
                System.out.println("account balance latch count " + latch.getCount());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class FraudService implements Runnable {
        private final CountDownLatch latch;
        
        FraudService(CountDownLatch latch) {
            this.latch = latch;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Initializing fraud service ...\n");
                Thread.sleep(10000); // 2 seconds
                System.out.printf("Fraud service ready !!!\n");
                latch.countDown();
                System.out.println("fraud service latch count " + latch.getCount());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
}