package com.skbh.main;

class Root{
	public Root()
	{
		System.out.println("root class construtor called");
	}
	
	{
		System.out.println("static rootClass method");
	}

	public void test() {
		System.out.println("TEst methd called");
		
	}
	
}

public class ChildClass extends Root {

	public ChildClass(){
		System.out.println("Child Class construtor");
	}
	
	{
		System.out.println(" static ChildClass method");
	}
	
	
	public static void main(String[] args) {
		//ChildClass client=new ChildClass();
		Root root=new ChildClass();
	
		
		
		

	}

}
