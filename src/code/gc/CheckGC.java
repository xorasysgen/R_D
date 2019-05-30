package code.gc;

import java.util.Date;

class ObjectCleaner{
	 @Override
	 protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	System.out.println("finalize method called");
}

}


public class CheckGC  {
	
		public static void main(String [] args) {
		 Runtime rt = Runtime.getRuntime();
		 System.out.println("Total JVM memory: "
		+ rt.totalMemory());
		 System.out.println("Before Memory = "
		+ rt.freeMemory());
		  Date d = null;
		 for(int i = 0;i<10000;i++) {
		 d = new Date();
		 d = null;
		 }
		 System.out.println("After Memory = "
		+ rt.freeMemory());
		 rt.gc(); // an alternate to 
		 System.gc();
		 System.out.println("After GC Memory = "
		+ rt.freeMemory());
		 ObjectCleaner ObjectCleaner=new ObjectCleaner();
		 ObjectCleaner=null;
		 //System.gc();
		 }
		
}
