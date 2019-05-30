package com.skbh.main;

import java.util.IdentityHashMap;
public class Ascii {

	public static void main(String[] args) {
		int a=97;
		System.out.println(new Integer(1).hashCode());
		char ch=(char) 97;
		System.out.println(ch);
		IdentityHashMap<Integer,String> identityHashMap=new IdentityHashMap<Integer,String>();
		System.out.println(System.identityHashCode(new Integer(0)));
		System.out.println(System.identityHashCode(new Integer(2)));
		Integer zero=new Integer(0);
		identityHashMap.put(zero, "Zero");
		identityHashMap.put(new Integer(0), "Zero");
		identityHashMap.put(zero, "Zero");
		System.out.println("identityHashMap.size() :" + identityHashMap.size());
		

	}

}
