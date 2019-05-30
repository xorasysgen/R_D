package com.skbh.impl.InterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TempClass {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,4,3,2,5,6,1,3,3,3,6,3,3));
		Set<Integer> set=new HashSet<>(list);
		Map<Integer,Integer> map=new HashMap<>();

		for (Integer integer : set) {
			map.put(integer, Collections.frequency(list, integer));
		}
		System.out.println(map);
		
		map.clear();
		for(int i=0;i<list.size();i++){
			if(map.containsKey(list.get(i)))
			map.put(list.get(i),map.get(list.get(i))+1);
			else
				map.put(list.get(i), 1);
			
	}
		System.out.println(map);
	}
}
