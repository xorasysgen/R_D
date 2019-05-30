package com.skbh.impl;

public class Reverse {

	public static Integer reverseNumber(Integer i){
		if(i>0){
		System.out.println(i);
		return reverseNumber(i-1);
		}
		return 0;
		
	}
	public static void main(String[] args) {
		System.out.println(reverseNumber(25));
		System.out.println("reverse of any number");

	}

}
