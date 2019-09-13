package code.java8.ext;

import java.util.HashMap;
import java.util.Map;

public class ForEachAndMap_1 {
	private static void forEachAndMap() {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("C", 30);
		map.put("F", 60);
		map.put(null, 596);
		map.put("A", 10);
		map.put("E", 50);
		map.put("D", 40);
		System.out.println(map.put(null, null));
		map.put("B", 20);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> kv:map.entrySet()) { // in java 7 
			System.out.print(kv.getKey() + "#" + kv.getValue() + " ");
		}
		
		System.out.println();
		// biconsumer takes two parameters 
		map.forEach((k,v)-> System.out.print("#" + k + v + " "));	 // in Java 8
		
	}
	
	public static void main(String[] args) {
		ForEachAndMap_1.forEachAndMap();
		
	}

}
