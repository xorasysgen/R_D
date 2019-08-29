package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableList;

public class BaeldungJ8 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5,2,2,2,2,1,1);
		List<String> names=new ArrayList<>(Arrays.asList("sushil","kumar","bhaskar"));		 
	    Map<Object, Long> result = numbers.stream()
	    		.filter(x->x<=2)
	    		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
	    
	    System.out.println(result);
	    System.out.println("result" + result);
	
	    /*https://www.baeldung.com/java-8-collectors
	    find the length of string by identity*/
	   
	    /*Function.identity() is just a shortcut for defining function that accepts and return the same value;*/
	    Map<String,Integer> map=names.stream().collect(Collectors.toMap(Function.identity(), String::length));
	    Map<String,Integer> map1=names.stream().collect(Collectors.toMap(x->x, x->x.length()));
	    Map<String,Integer> map3=names.stream().collect(Collectors.toMap(x->x, x->x.length(),(c1,c2)->c1));
	    System.out.println(map);
	    System.out.println(map1);
	    names.add("sushil");
	    /*Sometimes you might encounter a situation where you might end up with a key collision. In such case, you should use toMap with another signature.*/
	    System.out.println(map3);
	    
	    List<String> list = names.stream()
	    		  .collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableList::copyOf));
	    System.out.println(list);
	    /*joining collector can be used for joining Stream<String> elements.
	    We can join them together by doing:*/
	    String text=list.parallelStream().collect(Collectors.joining(","));
	    
	    System.out.println(text);
	    
	    String text1=list.parallelStream().collect(Collectors.joining(",","Pre","Post"));
	    
	    System.out.println(text1);
	    IntSummaryStatistics dss=list.stream().collect(Collectors.summarizingInt(String::length));
	    System.out.println(dss.getMax());
	    System.out.println(dss.getMin());
	    System.out.println(dss.getCount());
	    System.out.println(dss.getAverage());
	    System.out.println(dss.getSum());
	    System.out.println(dss.toString());

	}

}
