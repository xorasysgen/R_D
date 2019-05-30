package com.skbh.impl;

class Models{
	int a=0;
	float f=5.0f;
	
}
public class StringTest {
	
	public static void main(String[] args) {
		String s=new String("(");
		String s1="()";
		System.out.println(s.compareTo(s1));
		String a=null;
		System.out.println(5.0f);
		System.out.println("foo".equals(a));
		System.out.println("foo".equals((String)null));
		System.out.println("foo".compareTo((String)null));
	}

}
