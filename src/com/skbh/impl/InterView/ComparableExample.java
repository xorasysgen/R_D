package com.skbh.impl.InterView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorList implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1%10>o2%10)? 1 : (o1%10<o2%10) ? -1 : 0;
	}
}

public class ComparableExample{
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10522);
		list.add(5256);
		list.add(925);
		list.add(2159);
		list.add(365);
		list.add(8896);
		list.add(770);
		list.add(3881);
		Collections.sort(list,new ComparatorList());
		System.out.println(list);
		
	}

}
