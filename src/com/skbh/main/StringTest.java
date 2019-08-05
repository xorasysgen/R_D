package com.skbh.main;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

class Data implements Comparable<Data>{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int compareTo(Data o) {
		if(this.getI()<o.getI())
			return 1;
		else if(this.getI()>o.getI())
			return -1;
		else
			return 0;
			
	}
	
	@Override
	public String toString() {
		return "Data [i=" + i + "]";
	}
	
	
}

public class StringTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str=new String("\\cx").intern();
		String st="\\cx";
		
		str.concat(str);
		System.out.println(str);
		System.out.println("emptiness".substring(8,9));
		System.out.println("emptiness".subSequence(8,9));
		StringBuffer sb=new StringBuffer("null");
		StringBuffer sb1=new StringBuffer("1");
		System.out.println(sb1.toString().equals(sb.toString()));
		sb.append(sb).append("ss").append(true);
		sb.hashCode();
		sb.deleteCharAt(5);
		System.out.println(sb.getClass());
		System.out.println(sb);
		StringBuilder sbd=new StringBuilder("sushil");
	
		
		/*Set<StringBuffer> set=new TreeSet<StringBuffer>();
		set.add(new StringBuffer("ds"));
		set.add(new StringBuffer("ds"));
		set.add(new StringBuffer("ds"));
		
		set.add(new StringBuilder("ds"));
		set.add(new StringBuilder("ds"));
		set.add(new StringBuilder("ds"));
		System.out.println(set);*/
		
		Data d=new Data();
		d.setI(23);
		Data d1=new Data();
		d1.setI(231);		
		Set<Data> set1=new TreeSet<Data>();
		set1.add(d1);
		set1.add(d);
		System.out.println(set1);
		
		Map<Data,String> t=new TreeMap<>();
		t.put(d, "sushil");
		t.put(d1, "sushil");
		System.out.println(t);
		SortedMap<Data,String> a=new TreeMap<>(t);
		System.out.println(a);
		

		
		
	}

}

