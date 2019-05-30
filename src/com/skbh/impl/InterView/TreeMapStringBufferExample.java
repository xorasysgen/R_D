package com.skbh.impl.InterView;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class BufferAdaptorProvider implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());	
	}
}

public class TreeMapStringBufferExample {

	public static void main(String[] args) {
		Map<StringBuffer,Integer> map=new TreeMap<>(new BufferAdaptorProvider());
		map.put(new StringBuffer("sushil"), 10);
		map.put(new StringBuffer("sushil"), 11);
		map.put(new StringBuffer("sushil1"), 12);
		
		for(Map.Entry<StringBuffer, Integer> mapdata : map.entrySet()){
			System.out.println("key :" + mapdata.getKey() + " " + "Value: " + mapdata.getValue());			
		}

	}

}
