package com.skbh.impl;

public class Fac {
	
	public static Integer factorial(Integer i){
		if(i>0)
			return factorial(i-1)*i;
		return 1;
		
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

}
