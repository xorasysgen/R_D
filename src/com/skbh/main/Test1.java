package com.skbh.main;

class Test2 {
	Test2 t=new Test2();
    public void printData(){
    	  System.out.println("Welcome in Super Class");
    }

}

public class Test1 extends Test2 {
	 
	public void printData(){
    	  System.out.println("Welcome in child Class");
   
	}
	
    Test1() {
    	super();
    	printData();
    	super.printData();
    }

    public static void main(String[] args) {
       method(null);
      
    }
    
    public static void method(Object o) {
		System.out.println("Object impl");
	}
	public static void method(String s) {
		System.out.println("String impl");
		}
    
}