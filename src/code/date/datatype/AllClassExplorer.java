package code.date.datatype;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class AllClassExplorer {
	
	
	private static void classExplorer(){
		Collection c;
		Collections c1;
		List l;
		ArrayList al;
		LinkedList lk;
		Vector v;
		Map m;
		HashMap m1;
		LinkedHashMap m2;
		FileNotFoundException f;
		IndexOutOfBoundsException io;
		ArrayIndexOutOfBoundsException ao;
		StringIndexOutOfBoundsException so;
		Exception e;
		RuntimeException r;
		Error er;
		
		
}
	

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		map.entrySet().removeIf(entry->entry.getKey()==3);
		map.entrySet().removeIf(entry->entry.getValue().equals("Two"));
		
		
		System.out.println(map);
		//map.compute(4, (k,v)->null);
		System.out.println(map);
		map.computeIfAbsent(52, (k)-> k.toString());
		map.computeIfPresent(52, (k,v)-> "new vAl");
		System.out.println(map);
		map.compute(4, (k,v)-> "four + four");
		System.out.println(map);
		map.compute(4, ( k,v) -> null);
		System.out.println(map);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(12);
		list.add(14);
		list.add(15);
		Collections.sort(list,(o,o1)-> (o>o1) ? 1: (o<o1)?-1:0);
		System.out.println(list);
		int [] r=list.stream().mapToInt(x->x).toArray();
		System.out.println(Arrays.toString(r));
		Arrays.sort(r);
		Collections.reverse(Arrays.asList(r));
		System.out.println(Arrays.toString(r));
		List<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("12");
		list1.add("14");
		list1.add("15");
		Collections.sort(list);
		list=list.stream().sorted((a,b)->(a>b?-1:(a<b)?1:0)).collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println("list" + list);
		String [] s=list1.stream().map(c->c).toArray(String[]::new);
		System.out.println(Arrays.toString(s));
		Arrays.stream(s).sorted(String::compareTo);
		

	}

}
