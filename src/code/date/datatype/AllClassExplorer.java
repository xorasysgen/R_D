package code.date.datatype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

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
		
		
		
}
	

	public static void main(String[] args) {

		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		System.out.println(map);
		//map.compute(4, (k,v)->null);
		System.out.println(map);
		map.computeIfAbsent(5, (k)-> k.toString());
		map.computeIfPresent(5, (k,v)-> "new vAl");
		System.out.println(map);
		map.compute(4, (k,v)-> "four + four");
		System.out.println(map);
		map.compute(4, ( k,v) -> null);
		System.out.println(map);

	}

}
