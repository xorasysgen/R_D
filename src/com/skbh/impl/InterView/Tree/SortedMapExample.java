package com.skbh.impl.InterView.Tree;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	private static void navigableMap() {
		NavigableMap<Integer,String> sm=new TreeMap<Integer,String>();
		sm.put(2000, "Othousand");
		sm.put(196, "one");
		sm.put(2, "two");
		sm.put(3, "three");
		sm.put(4, "four");
		sm.put(0, "Five");
		sm.put(-59, "negative");
		sm.put(1, null);
		if(sm.containsKey(-959)) {
			System.out.println(" key found");
		}
		else
			System.out.println("Not Found");
		
		if(sm.containsValue("negative")) {
			System.out.println("Found");
		}
		else
			System.out.println("Not Found");
		System.out.println(sm);
		System.out.println("lower entry" + sm.lowerEntry(4));
		System.out.println("heigher entry" + sm.higherKey(4));
		System.out.println("head map" + sm.headMap(4));
		System.out.println("tail map" + sm.tailMap(4));
		
		NavigableSet<Integer> nv=sm.descendingKeySet();
		System.out.println("NavigableSet" + nv);
		
	}
	
	private static void sortedMapTest() {
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(196, "one");
		sm.put(2, "two");
		sm.put(3, "three");
		sm.put(4, "four");
		sm.put(0, "Five");
		sm.put(-59, "negative");
		sm.put(1, null);
		Collection<String> c=sm.values();
		System.out.println("Collection" + c.toString());
		TreeMap<Integer,String> t=(TreeMap<Integer, String>) sm;
		System.out.println("Decending map" +  t.descendingMap());
		System.out.println(sm.firstKey());
		Map<Integer,String> map=sm.subMap(0, 5);
		System.out.println("subMap" + map);
		Map<Integer,String> map1=sm.tailMap(4);
		System.out.println("tail map" + map1);
		System.out.println(sm.containsValue("three"));
		
		for(Map.Entry<Integer, String> e : sm.entrySet()) {
			System.out.println("Value" + e.getValue());
			System.out.println("Key" + e.getKey());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		SortedMapExample.sortedMapTest();
		SortedMapExample.navigableMap();
	}
	

}
