package code.java8;

public interface C extends A{

	@Override
	default void show() {
		//A.super.show();
		System.out.println("C show method");
	}
	
	
}
