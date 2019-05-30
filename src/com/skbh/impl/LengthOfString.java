package com.skbh.impl;

import java.sql.DriverManager;

import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

public class LengthOfString {
	
private int loop=0;
private String s="sushil";
	
	private int lengthOfStringPrivate(String string){
		char[] st=string.toCharArray();
		try{
		for(loop=0;;loop++){
			char t=st[loop];
		}
		}
		catch(ArrayIndexOutOfBoundsException ar){
			return loop;
		}
		
	}
	
private static Integer i=0;
	
	public static Integer lengthOfString(String string){
		char[] st=string.toCharArray();
		try{
		for(i=0;;i++){
			char t=st[i];
		}
		}
		catch(ArrayIndexOutOfBoundsException ar){
			return i;
		}
		
	}
	
	 @CallerSensitive
	public static void main(String[] args) {
		System.out.println(lengthOfString("string"));
		
						

	}

}
