package com.skbh.impl.InterView.Tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashTableExample {

	public static void main(String[] args) {
		Map<Integer,String> map0=new HashMap<Integer,String>();
		map0.put(null, null);//null values allowed
		map0.put(null, null);//null values allowed
		System.out.println(map0);
		
		Map<Integer,String> map1=new LinkedHashMap<Integer,String>(5,0.85f);
		System.out.println(map1.put(null, "1"));//null values allowed
		System.out.println(map1.put(null, "2"));//null values allowed
		System.out.println(map1);
		Set<Integer> set=new TreeSet<Integer>();
		//System.out.println(set.add(null));//Exception in thread "main" java.lang.NullPointerException
		
		Map<Integer,String> map=new Hashtable<Integer,String>();
		//map.put(null, "null");//Exception in thread "main" java.lang.NullPointerException

	}

}
