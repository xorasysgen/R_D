package com.skbh.impl.InterView.List;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MapComparator implements Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o1.toString().compareTo(o2.toString());
	}
}


public class TreeMapStringBufferEample {

	public static void main(String[] args) {
		
		Map<StringBuffer,Integer> map=new TreeMap<>(new MapComparator());
		System.out.println(map.put(new StringBuffer("A"), 65));
		System.out.println(map.put(new StringBuffer("B"), 66));
		System.out.println(map.put(new StringBuffer("C"), 67));
		System.out.println(map.put(new StringBuffer("D"), 68));
		System.out.println(map.put(new StringBuffer("C"), 0));
		System.out.println(map.put(new StringBuffer("A"), 523));
		
		System.out.println(map);
		map.clear();
		System.out.println(map);

	}

}
