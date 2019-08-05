package code.test.collections.methods;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class MapTest {

	private static Map<Integer,Integer> map= new LinkedHashMap<>();
	
	public static void addValueToMap() {
		for (int i = 1; i < 10; i++) {
			map.put(i, i+786*new Random().nextInt(i));
		}
	}
	
	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	public static void main(String[] args) {
	 	addValueToMap();
		 for(Entry<Integer, Integer> map:map.entrySet()) {
			 System.out.print(map.getKey() + ":" +  map.getValue() +"  ");
		 }
		 if(map.containsValue(1)) {
			 map.remove(1);
		 }
		 System.out.println();
		 for(Entry<Integer, Integer> map:map.entrySet()) {
			 System.out.print(map.getKey() + ":" +  map.getValue() +"  ");
		 }
		 System.out.println(map.size());
		Collection<Integer> s=map.values();
		System.out.println(map.equals(1));
		Map<Integer,Integer> map1 =Collections.unmodifiableMap(map);
		map.put(2323, 23232);
		System.out.println(map);
		System.out.println(map1);
		
	
	}

}
