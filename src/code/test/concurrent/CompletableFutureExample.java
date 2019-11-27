package code.test.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        {
            CompletableFuture cf = CompletableFuture.runAsync(() -> {
                System.out.printf("[%s] I am Cool\n", Thread.currentThread().getName());
               
            });
            
            try {
            	System.out.println(cf.get());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }

        {
            CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
                System.out.printf("[%s] Am Awesome\n", Thread.currentThread().getName());
                return "Second one";
            });
            
            try {
                System.out.println(cf.get());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    
        {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            
            CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
                System.out.printf("[%s] And am Smart\n", Thread.currentThread().getName());
                return "Third call";
            }, executor);
            
            executor.shutdown();
            
            try {
                System.out.println(cf.get());
            }
            catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }
    }
}
