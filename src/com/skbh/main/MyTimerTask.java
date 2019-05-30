package com.skbh.main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;
 
public class MyTimerTask extends TimerTask {
	 AtomicReference<String> a=new AtomicReference<String>();
   
    @Override
    public void run() {
    	  a.lazySet("sushil");
    	  System.out.println(a);
    	     a.compareAndSet("sushil", "skbh");
    	     System.out.println(a);
    	     a.getAndSet("sushil kumar bhaskar");
    	     System.out.println(a);
        System.out.println("Timer task started at:"+new Date());
        completeTask();
        a.compareAndSet("sushil kumar bhaskar", "new skbh");
        System.out.println("Timer task finished at:"+new Date());
 	     System.out.println(a);
    }
 
    private void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
    public static void main(String args[]){
        TimerTask timerTask = new MyTimerTask();
       
        
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask started");
       
        //cancel after sometime
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        
    }
 
}