package code.java8;

public interface B extends A {
	@Override
	default void show() {
		//A.super.show();
		System.out.println("B show method");
	}
}
