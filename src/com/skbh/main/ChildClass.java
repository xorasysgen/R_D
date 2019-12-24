package com.skbh.main;

class Root{
	public Root()
	{
		System.out.println("root class construtor called");
	}
	
	static {
		System.out.println("static rootClass method");
	}

	 {
		System.out.println("root block methd called");
		
	}
	
}

public class ChildClass extends Root {

	public ChildClass(){
		System.out.println("Child Class construtor");
	}
	
	static {
		System.out.println(" static ChildClass method");
	}
	
	 {
			System.out.println("child block methd called");
			
		}
	
	public static void main(String[] args) {
		//ChildClass client=new ChildClass();
		new ChildClass();
	
		
		
		

	}

}
