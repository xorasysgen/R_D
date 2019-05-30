package code.java8;

class FinalizeTest {
	
	private String test;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "To string";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
		super.finalize();
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}

public class ObjectClassImpl  {
	
	public static void main(String[] args) throws Throwable {
		FinalizeTest finalizeTest=new FinalizeTest();
		System.out.println(finalizeTest.toString());
		finalizeTest=null;
		System.out.println("end");
		System.gc(); 
	}

}
