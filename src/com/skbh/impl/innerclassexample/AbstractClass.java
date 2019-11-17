package com.skbh.impl.innerclassexample;

abstract class AbstractClass1 {
	
	private final String x;
	
	
	AbstractClass1(String x){
		System.out.println("Construtor");
		this.x=x;
	}
	
	
	protected void get1() {
		System.out.println("private");
	}
	
	public abstract void get2();
	public  Integer  get3() {
		System.out.println("abs get");
		return  0;
	}
	
}

class ab extends AbstractClass1{

	ab(String x) {
		super(x);
	}

	
	@Override
	public void get2() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Integer get3() {
		
		System.out.println("base class abs");
		return 1+  super.get3();
		
	}
	


	
}

public class AbstractClass {

	public static void main(String[] args) {
		System.out.println(new ab("Server").get3());
		new ab("Server").get1();
	}

}
