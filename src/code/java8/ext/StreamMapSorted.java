package code.java8.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// https://www.baeldung.com/java-hashmap-sort
public class StreamMapSorted {

	
	private Map<String,Integer> getMap(){
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("zero",0);
		map.put("sushil",11);
		map.put("ramu", 25);
		map.put("John", 31);
		map.put("Emillie", 8);
		map.put("Alex",45);
		map.put("peter", 85);
		map.put("roxi", 25);
		return map;
		
		
	}
	
	public static void main(String[] args) {
		
		 Map<String,Integer> map=new StreamMapSorted().getMap();
		 System.out.println(map);
		 List<Entry<String, Integer>> mapEntry=new ArrayList<>(map.entrySet());
		 Collections.sort(mapEntry,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
		  map=new LinkedHashMap<>();
		 for(Entry<String,Integer> entry : mapEntry) {
			 map.put(entry.getKey(),entry.getValue());
		 }//java 7
		 
		 
		 //java 8
		 Map<String,Integer> map1=map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				 .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(old,newVal)-> null, LinkedHashMap::new));
		 
		 Map<String,Integer> map2=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				 .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(oldVal,newVal)-> null , LinkedHashMap::new));
		 
		 System.out.println("By Key# " + map1);
		 System.out.println("By Value# " + map2);

	}

}
