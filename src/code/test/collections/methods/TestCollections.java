package code.test.collections.methods;


class B{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("B finalize method called...");
		super.finalize();
	}
	
	public void get() {
		System.out.println("get method done");
	}

}

class A extends B{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("A finalize method called...");
		super.finalize();
	}
	
	public void get() {
		System.out.println("Work done");
	}

}

public class TestCollections {

	public static void main(String[] args) {
		B a=new A();
		a.get();
		a=null;
		//System.gc();
		Runtime.getRuntime().gc();

	}

}
