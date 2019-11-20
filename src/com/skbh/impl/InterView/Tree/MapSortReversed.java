package com.skbh.impl.InterView.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortReversed {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		Map<Integer,String> map1;
		map.put(5,"sushil");
		map.put(6,"tsushil");
		map.put(8,"bushil");
		map.put(0,"dushil");
		map.put(1,"kushil");
		
		map1=map.entrySet().stream()
		.sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
		.collect(Collectors.toMap(
				Entry::getKey, Entry::getValue, (k,v) -> v, LinkedHashMap::new));
		System.out.println(map);
		System.out.println(map1);
		
	
		
		

	}

}
