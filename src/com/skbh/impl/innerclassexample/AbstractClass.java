package com.skbh.impl.innerclassexample;

abstract class AbstractClass1 {
	
	public abstract void get1();
	public abstract void get2();
	public  void get3() {
		
	}
	
}

class ab extends AbstractClass1{

	@Override
	public void get1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get2() {
		// TODO Auto-generated method stub
		
	}
	


	
}

public class AbstractClass {

	public static void main(String[] args) {
		new ab().get1();
	}

}
