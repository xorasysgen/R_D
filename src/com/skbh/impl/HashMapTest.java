package com.skbh.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		String [] khar={ "abc","def","abc","klp","def","sushil","abc"};
		List<String> list=Arrays.asList(khar);
		System.out.println(Collections.frequency(list, "abc"));
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			String string = (String) iterator.next();
			
		}
		
		Map<String,Integer> map=new  HashMap<String,Integer>();
		for (String string : list) {
			if(map.containsKey(string)){
				map.put(string, map.get(string)+1);
			}
			else
			map.put(string, 1);
		}
		System.out.println(map);
		if(map.containsKey("sushil")){
			System.out.println("Found");
		}
		System.out.println(map.values().remove(1));
		System.out.println(map);
		HashMapTest hashMapTest=new HashMapTest();
		hashMapTest.clone();
		
	}

}
