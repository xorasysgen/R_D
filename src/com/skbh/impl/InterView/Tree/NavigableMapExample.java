package com.skbh.impl.InterView.Tree;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	private static  void navigableMap() {
		NavigableMap<Integer,Integer> nm=new TreeMap<Integer,Integer>();
		nm.put(100, 1001);
		nm.put(200, 2002);
		nm.put(300, 3003);
		nm.put(400, 4004);
		nm.put(500, 5005);
		nm.put(600, 6006);
		nm.put(700, 7007);
		nm.put(800, 8008);
		
		System.out.println("Lower Entry#" + nm.lowerEntry(700));
		System.out.println("Higher Entry#" + nm.higherEntry(700));
		System.out.println("Floor Entry#" + nm.floorEntry(700));
		System.out.println("Ceiling Entry#" + nm.ceilingKey(700));
		System.out.println("decending map " + nm.descendingMap());
		System.out.println("decending key set "  + nm.descendingKeySet());
		System.out.println("decending map first key " + nm.descendingMap());
		
	}
	
	public static void main(String[] args) {
		NavigableMapExample.navigableMap();
	}

}

