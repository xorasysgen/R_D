package code.functionalInterface;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class LambdaVsAnonymous {

	@SuppressWarnings("unused")
	public void testAnonymous() {
		final int cnt = 0; 
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int cnt = 5;    
                System.out.println("in run" + cnt);
            }
        };

        Thread t = new Thread(r);
        t.start();
	}
	
	public void Lambda(){
		 int cnt = 0; 
        Runnable r = ()->{
          // int cnt = 5; //compilation error
            System.out.println("in run"+cnt);
            };
        Thread t = new Thread(r);
        t.start();
	}
	
	
	public static void main(String[] args) {
		
		  new LambdaVsAnonymous().testAnonymous(); new LambdaVsAnonymous().Lambda();
		  Comparable c; Comparator c1; Optional o; OptionalInt o1;
		 

		 
			 
	}

}
