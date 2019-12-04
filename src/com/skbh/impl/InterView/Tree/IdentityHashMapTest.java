package com.skbh.impl.InterView.Tree;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {

	
	
	public static void main(String[] args) {
		String s=new String("sushil");
		String d=new String("sushil");
			System.out.println(s==d);
			String p=s;
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(d));
		IdentityHashMap<String ,Integer> idmap=new IdentityHashMap<String,Integer>();
		idmap.put(new String("Sushil"), 1);
		idmap.put(new String("Sushil"), 2);
		idmap.put(s, 3);
		idmap.put(p, 589);
		idmap.put(d, 56986);
		idmap.computeIfAbsent("Sushil", (k)-> 0);
		
		System.out.println(idmap);
		System.out.println(idmap.get(new String("sushil")));
		
		
	}
	
	
}
