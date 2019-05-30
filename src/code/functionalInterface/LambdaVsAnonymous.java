package code.functionalInterface;

public class LambdaVsAnonymous {

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
		final int cnt = 0; 
        Runnable r = ()->{
            //int cnt = 5; //compilation error
            System.out.println("in run"+cnt);};
        Thread t = new Thread(r);
        t.start();
	}
	
	
	public static void main(String[] args) {
		 
	}

}
