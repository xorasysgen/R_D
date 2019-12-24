package com.skbh.impl.InterView.Tree;

import java.util.HashMap;
import java.util.Map;

public class ComputeIFExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "11");
		map.put(2, "22");
		map.put(3, "33");
		map.put(4, "44");
		map.put(5, "55");
		map.put(0, "0000");
		System.out.println(map);
		System.out.println("Map values: " + map.values().removeIf(x->x.equals("0000")));
		System.out.println("key set : " + map.keySet().removeIf(x->x.equals(5)));
		System.out.println(map);
		map.entrySet().removeIf(entry->entry.getKey().equals(0));
		System.out.println(map);
		
		//System.out.println(map.compute(1, (k,v)-> "sushil"));// if not present add to it
		//System.out.println(map.compute(2, (k,v)-> "sushil"));// if present update value to it
		//System.out.println(map.compute(3, (k,v)-> null));// if present delete entry  of key value 
		System.out.println(map.computeIfPresent(2, (k,v)-> "value"));// if present update new  value to it
		System.out.println(map.computeIfPresent(123, (k,v)-> "value11"));// if not present do nothing
		System.out.println(map.computeIfPresent(2, (k,v)-> null));// if  present and pass null it will delete entry 
		//System.out.println(map.computeIfAbsent(2, (k)-> "value"));// if present leave old value to it
		//System.out.println(map.computeIfAbsent(1, (k)-> "value"));// if not present add value to it
		//System.out.println(map.computeIfAbsent(5, (k)-> null));// if present pass null do not delete entry
		System.out.println(map);
		
		System.out.println("put if + " + map.put (1331, "value"));// if not present add value to it
		//map.replaceAll((k,v)-> "sushil");
		System.out.println(map);
		
	}

}
