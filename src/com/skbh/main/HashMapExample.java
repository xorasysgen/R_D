package com.skbh.main;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {

	public static void main(String[] args) {
		Integer i=new Integer(1);
		Integer i1=new Integer(1);
		Map<Integer,String> h=new ConcurrentHashMap<Integer,String>();
		System.out.println(h.put(1,"One"));
		System.out.println(h.put(2,"Two"));
		System.out.println(h.put(i,"Four"));
		System.out.println(h.put(i1,"Four"));
		System.out.println(h.put(new Integer(1),"new"));
		System.out.println(h.put(new Integer(1),"new"));
		System.out.println(h.size());

	}

}
