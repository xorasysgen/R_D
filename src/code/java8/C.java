package code.java8;

public interface C extends B{

	@Override
	default void show() {
		B.super.show();
		System.out.println("C show method");
	}
	
	
}
