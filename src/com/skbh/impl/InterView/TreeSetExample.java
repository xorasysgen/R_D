package com.skbh.impl.InterView;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample{
	
	public static void main(String[] args) {
		Set set=new TreeSet(new BufferAdaptor());
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("B"));
		set.add("A");
		set.add("ABCDEF");
		set.add(new StringBuffer("C"));
		set.add(new StringBuffer("D"));
		set.add("AD");
		System.out.println(Collections.reverseOrder());
		System.out.println(set);	
		System.out.println(new BigInteger("20").nextProbablePrime());
		System.out.println("traling zero : " + new Integer(2).numberOfLeadingZeros(255000));
				
	}

}
