package code.java8;

public interface B extends A {
	
	default void show() {
		System.out.println("B show method");
	}
}
