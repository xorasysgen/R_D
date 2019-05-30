package com.skbh.main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Reflection {

	public  static List<StackTraceElement> execute() throws IllegalArgumentException,
		NoSuchFieldException, SecurityException, IllegalAccessException {
		List<StackTraceElement> list=new ArrayList<StackTraceElement>();
		Field[] field = Integer.class.getDeclaredFields();
		
		/*for (Field field2 : field) {
			System.out.println(field2);
		}*/
		
		Method[] method=Collection.class.getDeclaredMethods();
		
		for (Method method2 : method) {
			System.out.println(method2);			
		}
		
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		for (StackTraceElement stackTraceElement : stackTraceElements) {
			list.add(stackTraceElement);
		}
		return list;
	}
	
	public static void main(String... args) throws IllegalArgumentException, NoSuchFieldException, SecurityException, IllegalAccessException, ClassNotFoundException, InstantiationException {
		//System.out.println(Reflection.execute().size());
		for (StackTraceElement string : Reflection.execute()) {
			System.out.println("Class name: " + string.getClassName());
			System.out.println("Method name: " + string.getMethodName());
			System.out.println("line No: " + string.getLineNumber());
		}
		
		ThreadExample threadExample = (ThreadExample) Class.forName("com.skbh.main.ThreadExample").newInstance();
		threadExample.setName("sushil");
		Class<?> noparams[] = new Class[2];
		noparams[0]=Integer.TYPE;
		noparams[1]=Integer.TYPE;
		String name = null;
		
		try {
			try {
				//System.setSecurityManager(new SecurityManager());
				Field field=threadExample.getClass().getDeclaredField("name");
				field.setAccessible(true);
				System.out.println(field.get("name"));
				Method method=threadExample.getClass().getDeclaredMethod("print",noparams);
				method.setAccessible(true);
				int result=(int) method.invoke(threadExample,20,3);
				System.out.println("Output of program " + result);
			} catch (InvocationTargetException exceptionObject) {
				exceptionObject.printStackTrace();
			}
		} catch (NoSuchMethodException exceptionObject) {
			exceptionObject.printStackTrace();
		}
	
	Random random = new Random();
	char[] choices = ("abcdefghijklmnopqrstuvwxyz" +"ABCDEFGHIJKLMNOPQRSTUVWXYZ" +"01234567890" +"$#_").toCharArray();
	int len=32;
	StringBuilder salt = new StringBuilder(len);
	
	for (int i = 0; i<len; ++i) {
		int r=random.nextInt(choices.length);
		System.out.println(r + ":" + choices[r]);
		//salt.append(choices[random.nextInt(choices.length)]);
		salt.append(choices[r]);
	}
	System.out.println(salt.toString());
	}
}