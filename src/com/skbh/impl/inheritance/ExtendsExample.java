package com.skbh.impl.inheritance;

class A{
	
	private int i;
	private int j;
	
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
	void displayA(){
		System.out.println("A");
	}

}

class B extends A{
	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static void  test(){
		System.out.println("static");
	}
	{
		System.out.println("block");
	}
	{
		System.out.println("block2");
	}
	B(int i,int j) {
		super(i,j);
		System.out.println("Construtor");
	}
	
	B(int i,int j,int k) {
		super(i,j);
	}
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

	ExtendsExample(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) throws InterruptedException {
		A a=new B(10,85);
		B a1=new B(10,85);
		a.displayA();
		//a.otherDisplay();//you cant call, not available in a
		
		
	}

}
