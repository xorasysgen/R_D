package com.skbh.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyOfItemCountColelction {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(1);
		Object [] ar=list.toArray();
		System.out.println(Arrays.deepToString(ar));
		


		System.out.println("a : " + Collections.frequency(list, "1"));

		
		Set<Integer> uniqueSet = new HashSet<Integer>(list);
		for (Integer temp : uniqueSet) {
			System.out.println(temp + " come  " + Collections.frequency(list, temp) + " types");
		}
		
		Map<Integer,Integer> map=new HashMap<>();
		for (Integer value : list) {
			if(map.containsKey(value)) 
			map.put(value, map.get(value)+1);
			else
				map.put(value, 1);
		}

		System.out.println(map);
	}

}
