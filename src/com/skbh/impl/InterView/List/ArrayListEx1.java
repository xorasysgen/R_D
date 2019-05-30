package com.skbh.impl.InterView.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class listComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1%10>o2%10? 1  : (o1%10<o2%10) ? -1:  0;
	}
	
} 


public class ArrayListEx1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1234);
		list.add(12);
		list.add(134);
		list.add(234);
		list.add(66235);
		list.add(771232);
		list.add(89127);
		
		Collections.sort(list,new listComparator());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("reverse : " + list);
		Comparator<Integer> abc=Collections.reverseOrder();
		System.out.println(abc);
		System.out.println("reverse ORDER: " + list);
		System.out.println(list.subList(0, list.size()));
		System.out.println(list.indexOf(771232));

	}

}
