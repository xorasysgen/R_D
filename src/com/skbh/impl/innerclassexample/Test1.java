package com.skbh.impl.innerclassexample;

class Root{
	
	public void getRoot() {
		String sushil=new String("Sushil");
		System.out.println("Root");
		
	} 
}

class Child extends Root{
	

	
public void getChild() {
		
	System.out.println("child");
	} 
	
}


class xxx extends Child{
	
	
public void getChild() {
		
	System.out.println("xxx");
	} 
	
	
	public void getxxx() {
		
		System.out.println("xxx");
		} 
}


public class Test1 {

	public static void main(String[] args) {
		
		 Child c=new xxx();
		
		String sushil="sushil";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		

	}

}
