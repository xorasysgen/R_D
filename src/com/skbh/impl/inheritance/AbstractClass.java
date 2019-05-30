package com.skbh.impl.inheritance;

abstract class abs{
	
	abstract void get();
	abs(){
		System.out.println("abs abstract class called");
	}
	static {
		System.out.println("super static");
	}
	{
		System.out.println("super simple block");
	}
}

class absImpl extends abs{
	private void get(int x){
		 System.out.println("Overloaded x " + x);
	 }
	{
		System.out.println("chile simple block");
	}
	static {
		System.out.println("child static");
	}
	absImpl(){
		
		System.out.println("absImpl constructor called");
	}
	 absImpl(String name){
		this();
		System.out.println("this 1 absImpl constructor called");
		
	}
	 absImpl(String name,String rank){
			System.out.println("this 2 absImpl constructor called");
			
		}

	@Override
	void get() {
		System.out.println("get method called");
		
	}
	
		
}

public class AbstractClass {

	public static void main(String[] args) {
		new absImpl("sushil","3").get();
		
	}

}
