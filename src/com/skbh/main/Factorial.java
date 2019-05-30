package com.skbh.main;

class Test{
	
	public static int factorials(int n){
		if(n==0) return 1;
		return factorials(n-1)*n;		
	}
	
	
}


public class Factorial {
	public static void main(String[] args) {
	System.out.println("Fact : " + Test.factorials(5));
	}
}
