package com.skbh.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class _Class {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<?> classs=Class.forName("com.skbh.impl.Palindrom");
		Palindrom palindrom=(Palindrom) classs.newInstance();
		Method method=palindrom.getClass().getDeclaredMethod("palindromCheck",new Class[]{String.class});
		method.setAccessible(true);
		Boolean booleana=(Boolean) method.invoke(new Palindrom(),"ABCDCBA");
		System.out.println(booleana);
	}

	
}
