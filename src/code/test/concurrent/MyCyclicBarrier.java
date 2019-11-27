package code.test.concurrent;

import java.util.concurrent.CyclicBarrier;

public class MyCyclicBarrier {
    public static void main(String[] args) {
        final int COUNT = 4; // 1 main thread and 3 verify threads
        
        final String[] CARD_NOS = { "1234-5678-9000-1111", "1234-5678-9000-2222" };
        final String[] PINS = { "1234", "5678" };
        final double[] AMOUNTS = { 1500.99, 1249.99 };
        
        CyclicBarrier barrier = new CyclicBarrier(COUNT);
        
        for (int i = 0; i < CARD_NOS.length; i++) {
            Thread ac = new Thread(new AuthenticationCheck(barrier, CARD_NOS[i], PINS[i]));
            ac.setName("AuthenticationCheckThread");

            Thread bc = new Thread(new BalanceCheck(barrier, CARD_NOS[i], AMOUNTS[i]));
            bc.setName("BalanceCheckThread");

            Thread fc = new Thread(new FraudCheck(barrier, CARD_NOS[i], AMOUNTS[i]));
            fc.setName("FraudCheckThread");

            System.out.printf("Transaction processing started for %s\n", CARD_NOS[i]);

            barrier.reset();

            ac.start();
            bc.start();
            fc.start();

            try {
                barrier.await();
            }
            catch (Exception ex) {
            }

            System.out.printf("Transaction processing completed for %s\n", CARD_NOS[i]);
        }
    }
    
    static class AuthenticationCheck implements Runnable {
        private final String cardNo;
        private final String pin;
        private final CyclicBarrier barrier;
        
        AuthenticationCheck(CyclicBarrier barrier, String cardNo, String pin) {
            this.barrier = barrier;
            this.cardNo = cardNo;
            this.pin = pin;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Ready to perform authentication check for %s\n", cardNo);
                Thread.sleep(3000); // 3 seconds
                System.out.printf("Completed authentication check for %s\n", cardNo);
                barrier.await();
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class BalanceCheck implements Runnable {
        private final String cardNo;
        private final double amount;
        private final CyclicBarrier barrier;
        
        BalanceCheck(CyclicBarrier barrier, String cardNo, double amount) {
            this.barrier = barrier;
            this.cardNo = cardNo;
            this.amount = amount;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Ready to perform balance check on %s for amount %.02f\n", cardNo, amount);
                Thread.sleep(2000); // 2 seconds
                System.out.printf("Completed balance check for %s for amount %.02f\n", cardNo, amount);
                barrier.await();
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class FraudCheck implements Runnable {
        private final String cardNo;
        private final double amount;
        private final CyclicBarrier barrier;
        
        FraudCheck(CyclicBarrier barrier, String cardNo, double amount) {
            this.barrier = barrier;
            this.cardNo = cardNo;
            this.amount = amount;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Ready to perform fraud check on %s for amount %.02f\n", cardNo, amount);
                Thread.sleep(1000); // 1 second
                System.out.printf("Completed fraud check on %s for amount %.02f\n", cardNo, amount);
                barrier.await();
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
}