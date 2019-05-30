package com.skbh.impl.inheritance;

class A{
	void displayA(){
		System.out.println("A");
	}

}

class B extends A{
	void displayB(){
		System.out.println("B");
	}
	void displayA(){
		System.out.println("B of displayA");
	}
	void otherDisplay() {
		System.out.println("otherDisplay");
	}
} 

public class ExtendsExample extends B {

	public static void main(String[] args) throws InterruptedException {
		A a=new B();
		a.displayA();
		//a.otherDisplay();//you cant call, not available in a
		
		
	}

}
