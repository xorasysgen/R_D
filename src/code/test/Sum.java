package code.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(12);
		
		
		list2.add(1);
		list2.add(2);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		
		
		
		list1.removeAll(list2);
		
		System.out.println(list1);
		Integer i=0;
		for (Integer integer : list1) {
			i=i+integer;
			
		}
		
		System.out.println(i);

	}

}
