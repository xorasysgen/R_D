package com.skbh.impl.InterView.Set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	private static void sortedSetTest() {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> ll=new LinkedList<Integer>();
		TreeSet<Integer> set1=new TreeSet<Integer>();
		set1.add(1250);
		set1.add(1320);
		set1.add(1350);
		set1.add(1410);
		set1.add(1450);
		System.out.println("Higher than" + set1.higher(1350));
		System.out.println("Lower than" + set1.lower(1350));
		System.out.println("ceiling " + set1.ceiling(1410));
		System.out.println("FLOORING " + set1.floor(1330));
		System.out.println("heading of  " + set1.headSet(1350));
		SortedSet<Integer> newSet=set1.headSet(1350);
		SortedSet<Integer> newSet1=set1.tailSet(1350);
		SortedSet<Integer> newSet2=set1.descendingSet();
		System.out.println("decending set" + newSet2);
		System.out.println("head set" + newSet);
		System.out.println("tail set" + newSet1);
		
	}
	
	public static void main(String[] args) {
		SortedSetExample.sortedSetTest();
	}

}
