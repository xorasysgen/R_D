package com.skbh.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class DuplicateFinder {
	
	private static List<Integer> duplicateFinderMethod(List<Integer> data){
		Set<Integer> numbers=new TreeSet<Integer>();
		List<Integer> i=new ArrayList<Integer>();
		for (Integer integer : data) {
			if(integer!=null){
			if(!(numbers.add(integer)))
			i.add(integer);
			}
		}
		return i;
		
		
	}
	
	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		/*System.out.println(data1.add(1));
		System.out.println(data1.add(2));
		System.out.println(data1.add(2));*/
		data.add(null);
		data.add(2);
		data.add(462);
		data.add(462);
		data.add(2);
		data.add(2);
		data.add(3);
		data.add(3);
		data.add(4);
		data.add(1);
		data.add(48);
		data.add(48);
		//System.out.println(data.size());
		System.out.println(duplicateFinderMethod(data));
	}

}
