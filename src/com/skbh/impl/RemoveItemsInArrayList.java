package com.skbh.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveItemsInArrayList {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>(Arrays.asList(1,1,null,45,2,1,2,1,8,9,3,1,0,null,1,43,1,null));
		//while(a.remove(new Integer(1)) || a.remove(null));
		
		while(a.contains(new Integer(1)) || a.contains(null)) {
			a.remove(new Integer(1));
			a.remove(null);
		}
		System.out.println(a);

	}

}
