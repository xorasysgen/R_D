package code.test;

interface staticInteface{
	
	public static Integer x=500;
	
	static void staticMethod() {
		int p=3;
		p+=p+20;
				
		System.out.println("Interface staticMethod" + p);
	}
	
	 default void defaulMethod() {
		System.out.println("Interface defaulMethod");
	}
}
public class InterfaceTest implements staticInteface {

	static void staticMethod() {
		System.out.println("class staticMethod");
	}
	
public static void main(String[] args) {
		staticInteface.staticMethod();
		InterfaceTest.staticMethod();
		new InterfaceTest().defaulMethod();

	}

	@Override
	public void defaulMethod() {
		System.out.println("class defaulMethod");
	}

}
