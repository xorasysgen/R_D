package com.skbh.main;

import java.util.Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class WordCount {

	public static void main(String[] args) {
		String [] strings={"a", "a", "b", "f", "b", "a", "z"};
		 Map<String,Integer> map = new HashMap<String,Integer>();
		  for (String s: strings) {
		    if (map.containsKey(s))  
		    	map.put(s, map.get(s) + 1);
		    else// first time we've seen this string
		    	map.put(s, 1);
		   
		  }
		 System.out.println(map);
		 Map<String,Integer> m=new HashMap<>();
		 for (String string : strings) {
			 m.put(string, Collections.frequency(Arrays.asList(strings), string));
			 //System.out.println(Collections.frequency(Arrays.asList(strings), string));
		}
		 System.out.println(map);
	}

}
