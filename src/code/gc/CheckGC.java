package code.gc;

class ObjectCleaner {

	void testObjectCleaner() {
		System.out.println("Only called when JVM found ObjectCleaner Object is NULL");
	}

	
	@Override
	protected  void finalize() throws Throwable {
	    // TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method called");
	}

}

public class CheckGC {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());
		System.out.println("Before Memory = " + rt.freeMemory());
		System.out.println("After Memory = " + rt.freeMemory());
		System.gc();
		System.out.println("After GC Memory = " + rt.freeMemory());
		ObjectCleaner objectCleaner = new ObjectCleaner();
		objectCleaner.testObjectCleaner();
				
		objectCleaner = null;
				
		//rt.gc(); // an alternate to
		System.gc();
	}

}
