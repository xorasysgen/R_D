package code.java8.ext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	
	
private static void hashMapMethod() {
		
		Map<Integer,String> list=new HashMap<Integer,String>();
		list.put(1,"sushil");
		list.put(null,null);
		list.put(3,"sushil");
		list.put(4,"sushil4");
		list.put(5,"sushil5");
		System.out.println(list.remove(3));
		System.out.println(list);
		
		for(Entry<Integer, String> key :list.entrySet()) {
			System.out.println(key);
		}
		
		
	}
	
	public static void main(String[] args) {
		HashMapTest.hashMapMethod();
	}

}
