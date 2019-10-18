package com.skbh.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestClass {

	static List<Integer>  list;
	
	private static  List<Integer> makeList() {
		list=new ArrayList<>(Arrays.asList(1,2,3,5,6,null,434,343,6673,2,34,2,4,2,null,944,7,4,2352,null));
		return list;
		
	}
	
	private static void remove() {
	System.out.println(list);
	list.removeAll(Collections.singleton(null));
	Set<Integer> s=Collections.singleton(1);
	System.out.println(s);
	System.out.println(list);
	} 
	
	
	public static void main(String[] args) {
		TestClass.makeList();
		TestClass.remove();

	}

}
