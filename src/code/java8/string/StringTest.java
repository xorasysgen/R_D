package code.java8.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringTest {

	private static void test() {
		
		String s=new String("Ab").intern();
		String x="Ab";
		StringBuilder s1=new StringBuilder("Ab");
		String s2=new String("Ab").intern();;
		System.out.println(s==s2);
		//System.out.println(s1==x);
		
		
		//System.out.println("s0.hashCode() " + s0.hashCode());
		System.out.println("s.hashCode() " + s.hashCode());
		System.out.println("s1.hashCode() " + s1.hashCode());
		System.out.println("s2.hashCode() " + s2.hashCode());
		
	}
	
	
	public static void main(String[] args) {
		test();
		List<Integer> list=new ArrayList<>(Arrays.asList(5,4,58,2,58,5,6,58,3,58));
		if(list.contains(58))
		list.remove(list.indexOf(58));
				
		while(list.contains(58))
			list.remove(list.indexOf(58));
		
		
		System.out.println(list);
		Object[] ii=list.toArray();
		Integer [] n=new Integer[ii.length];
		Integer [] jj=list.toArray(n);
		
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		System.out.println(map);

	}

}
