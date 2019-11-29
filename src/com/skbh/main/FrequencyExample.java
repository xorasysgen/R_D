package com.skbh.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencyExample {

	private static List<Integer> rank(List<Integer> list) {
		Map<Integer,Integer> map=new HashMap<>();
		Map<Integer,Integer> map1=new LinkedHashMap<>();
		for (Integer integer : list) {
			map.put(integer,Collections.frequency(list, integer));
		}
		map1=map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByKey().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Entry::getValue,(k,v)-> k,LinkedHashMap::new));
		System.out.println(map1);
		
		
		return  map1.entrySet().stream().map((r)->r.getValue()).collect(Collectors.toList());
		
	} 
	
	
	public static void main(String[] args) {
		System.out.println(FrequencyExample.rank(Arrays.asList(100,50,50,25,0,2,0,0)));

	}

}
