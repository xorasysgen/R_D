package com.skbh.impl.innerclassexample;

abstract class A{
	
	A get() {
		return this;
	}
	void getMessage() {
		System.out.println("get message return type A");
	}
}

class B extends A {
	
	A get() {
		return this;
	}
	
	void getMessage() {
		System.out.println("get message return type B");
	}
	
}


public class ReturnTypeTest {

	public static void main(String[] args) {
		new B().get().getMessage();

	}

}
