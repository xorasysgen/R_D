package com.skbh.impl.innerclassexample;

class Popcorn{

	public void getPopCon() {
		System.out.println("popcorn");
	} 
}


class Food{
	Popcorn p=new Popcorn() {
		public void getPopCon() {
			System.out.println("anonymous popcorn");
		} 
		public void getPopCon1() {
			System.out.println("anonymous popcorn");
			System.gc();
		} 
	};
}


public class InnerClassExample {

	public static void main(String[] args) {
		Food f=new Food();
		f.p.getPopCon();

	}

}
