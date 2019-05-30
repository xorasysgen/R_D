package com.skbh.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Test {

	public static void main(String... ab) throws InterruptedException {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("klm");
		
		if(list.contains("abc"));
		list.remove("abc");
		System.out.println(list);
		
		Thread.sleep(5000);
		Iterator<String> it=list.iterator();
	 for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		if(string.equals("abca"))
		iterator.remove();
		
		//list.remove("abcd");
		//list.add("ss");
		
	}
			/*for(String a:list){
				if(list.contains("abc")){
					list.add("abc");
				}
			}*/
		
		System.out.println(list);
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		System.out.println(map.put(new Integer(1), "one"));
		System.out.println(map.put(new Integer(2), "two"));
		System.out.println(map.put(new Integer(1), "three"));
		for(Entry<Integer, String> maps : map.entrySet()){
			System.out.println(maps.getKey());
			System.out.println(maps.getValue());
			//map.put(33,"value");
		}
		
	}
}
