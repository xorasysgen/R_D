package com.skbh.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListIterator {

	public static void main(String[] args) {
		java.util.ListIterator<String> listIt=null;
		String [] str={"abc","def","ghi","jkl","mno","pqr","&*()","@#%@#%"};
		List<String> list=Arrays.asList(str);
		listIt=list.listIterator();
		while(listIt.hasNext()){
			System.out.println(listIt.next());
			
		}
		System.out.println("_________________________");
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous());
		}
		
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		map.put(2, 1);
		map.put(new Integer(2), 2);
		map.put(3, 3);
		map.put(4, 4);
		for(Map.Entry<Integer, Integer> mapIt : map.entrySet()){
			System.out.println(mapIt.getKey() + " "  + mapIt.getValue());			
		}
		
	}

}
