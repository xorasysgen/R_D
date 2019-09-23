package code.java8.ext;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Filter_4 {

	private static String findLongestString(ArrayList<String> list) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		for (String string : list) {
			map.put(string.length(),string);
		}
		
		System.out.println(map);
		System.out.println(map.lastEntry().getValue());
		
		
		Map<String,Long> tMap=list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Long a=list.stream()
				.collect(Collectors.counting());
		System.out.println(a);
		
		list.listIterator().forEachRemaining(x->System.out.println(x.length()));
		return null;
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("first wswwwwwwwwwwwwwwwww");
		list.add("Second");
		list.add("Fourth String");
		list.add("Third");
		list.add("four");
		list.add("Five");
		list.add("Longest String is here");
		
		Filter_4.findLongestString(list);

	}

}
