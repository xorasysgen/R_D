package com.skbh.impl;

public class Fabonacii {
	
	public static Integer  fab(Integer i) {
		if(i==0)
			return 0;
		if(i==1)
			return 1;
		else
			return fab(i-2) + fab(i-1); 
		
	}
	

	public static void main(String[] args) {
		for(Integer i=0;i<=5;i++) {
			System.out.print(fab(i) + " ");
		}

	}

}
