package code.test.concurrent;

import java.util.concurrent.Phaser;

public class MyPhaser {
    public static void main(String[] args) {
        final String[] CARD_NOS = { "1234-5678-9000-1111", "1234-5678-9000-2222" };
        final String[] PINS = { "1234", "5678" };
        final double[] AMOUNTS = { 1500.99, 1249.99 };
        
        Phaser phaser = new Phaser();
        
        for (int i = 0; i < CARD_NOS.length; i++) {
            System.out.printf("Current phase %d, Registered threads %d (begin)\n", phaser.getPhase(), phaser.getRegisteredParties());

            phaser.register(); // For main thread

            System.out.printf("Current phase %d, Registered threads %d (main)\n", phaser.getPhase(), phaser.getRegisteredParties());

            Thread ac = new Thread(new AuthenticationCheck(phaser, CARD_NOS[i], PINS[i]));
            ac.setName("AuthenticationCheckThread");

            Thread bc = new Thread(new BalanceCheck(phaser, CARD_NOS[i], AMOUNTS[i]));
            bc.setName("BalanceCheckThread");

            Thread fc = new Thread(new FraudCheck(phaser, CARD_NOS[i], AMOUNTS[i]));
            fc.setName("FraudCheckThread");

            System.out.printf("Transaction processing started for %s\n", CARD_NOS[i]);

            ac.start();
            bc.start();
            fc.start();

            phaser.arriveAndAwaitAdvance();

            System.out.printf("Transaction processing completed for %s\n", CARD_NOS[i]);

            System.out.printf("Current phase %d, Registered threads %d (end)\n", phaser.getPhase(), phaser.getRegisteredParties());
        }
    }
    
    static class AuthenticationCheck implements Runnable {
        private final String cardNo;
        private final String pin;
        private final Phaser phaser;
        
        AuthenticationCheck(Phaser phaser, String cardNo, String pin) {
            this.phaser = phaser;
            this.cardNo = cardNo;
            this.pin = pin;
        }
        
        @Override
        public void run() {
            try {
                phaser.register();
                System.out.printf("Current phase %d, Registered threads %d (ac-begin)\n", phaser.getPhase(), phaser.getRegisteredParties());
                System.out.printf("[Phase: %d] Ready to perform authentication check for %s\n", phaser.getPhase(), cardNo);
                Thread.sleep(3000); // 3 seconds
                System.out.printf("[Phase: %d] Completed authentication check for %s\n", phaser.getPhase(), cardNo);
                phaser.arriveAndDeregister();
                System.out.printf("Current phase %d, Registered threads %d (ac-end)\n", phaser.getPhase(), phaser.getRegisteredParties());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class BalanceCheck implements Runnable {
        private final String cardNo;
        private final double amount;
        private final Phaser phaser;
        
        BalanceCheck(Phaser phaser, String cardNo, double amount) {
            this.phaser = phaser;
            this.cardNo = cardNo;
            this.amount = amount;
        }
        
        @Override
        public void run() {
            try {
                phaser.register();
                System.out.printf("Current phase %d, Registered threads %d (bc-begin)\n", phaser.getPhase(), phaser.getRegisteredParties());
                System.out.printf("[Phase: %d] Ready to perform balance check on %s for amount %.02f\n", phaser.getPhase(), cardNo, amount);
                Thread.sleep(2000); // 2 seconds
                System.out.printf("[Phase: %d] Completed balance check for %s for amount %.02f\n", phaser.getPhase(), cardNo, amount);
                phaser.arriveAndDeregister();
                System.out.printf("Current phase %d, Registered threads %d (bc-end)\n", phaser.getPhase(), phaser.getRegisteredParties());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
    
    static class FraudCheck implements Runnable {
        private final String cardNo;
        private final double amount;
        private final Phaser phaser;
        
        FraudCheck(Phaser phaser, String cardNo, double amount) {
            this.phaser = phaser;
            this.cardNo = cardNo;
            this.amount = amount;
        }
        
        @Override
        public void run() {
            try {
                phaser.register();
                System.out.printf("Current phase %d, Registered threads %d (fc-begin)\n", phaser.getPhase(), phaser.getRegisteredParties());
                System.out.printf("[Phase: %d] Ready to perform fraud check on %s for amount %.02f\n", phaser.getPhase(), cardNo, amount);
                Thread.sleep(1000); // 1 second
                System.out.printf("[Phase: %d] Completed fraud check on %s for amount %.02f\n", phaser.getPhase(), cardNo, amount);
                phaser.arriveAndDeregister();
                System.out.printf("Current phase %d, Registered threads %d (fc-end)\n", phaser.getPhase(), phaser.getRegisteredParties());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
}