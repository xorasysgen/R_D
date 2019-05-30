package com.skbh.main;

import java.lang.reflect.Field;

public class PrivateStringHack  extends SecurityManager{
	private static final String hacked="hacked";
	private  static final String greet="hello";
	
	static{
	}

	public static String getGreet() {
		return greet;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field=String.class.getDeclaredField("value");
		field.setAccessible(true);
		field.set("hello", hacked.toCharArray());
		field.setAccessible(false);
		System.out.println(getGreet());
		System.out.println("hello");
		
	}
	
	

}
