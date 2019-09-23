package code.java8.ext;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.baeldung.com/java-8-collectors
public class CollectorsEx_5 {

	private List<String> list=new ArrayList<String>(Arrays.asList(null,"AA","","B","C","D","F", "", "G","a", null, "bb", "ccc", "dd", null));
	
	//stream to list	
	private void streamTOList() {
		System.out.println(list.stream().collect(Collectors.toList()));
	}
	
	
	//stream to set and mapped to upper case
	private void streamTOSet() {
		System.out.println(list.stream().filter(x->x!=null).map(x->x.toUpperCase()).collect(Collectors.toSet()));
	}
	
	//stream to map (KV) before did filter  
	private void streamToMap(){
		System.out.println(list.stream().filter(x->x!=null).filter(x->!x.isEmpty()).collect(Collectors.toMap(x->x.toString(), x->x.toString())));
		
	}
	
	//map length of string in list
	private void streamToMapLenghtof() {
		Map<String,Integer> len=list.stream()
		.filter(x->x!=null)
		.filter(x->!x.isEmpty())
		.collect(Collectors.toMap(Function.identity(), x->x.length()));
		len.forEach((k,v)->System.out.print(k  + " = "+ v + "\n"));
		
		
	}
	
	// remove blank data or null
	private void streamFilter() {
		System.out.println(list.stream().filter(x->x!=null).filter(x->!x.isEmpty()).collect(Collectors.toList()));
		
	}
	
		
	private void streamCollectorsCounting() {
		System.out.println(list.stream()
		.collect(Collectors.counting()).longValue());
		
	}
	
		
	public static void main(String[] args) {
		new CollectorsEx_5().streamTOList();
		new CollectorsEx_5().streamTOSet();
		new CollectorsEx_5().streamToMap();
		new CollectorsEx_5().streamFilter();
		new CollectorsEx_5().streamToMapLenghtof();
		new CollectorsEx_5().streamCollectorsCounting();
		int p=2;
		p+=p;
		System.out.println(p);
		p+=p--;
		System.out.println(p);
		p+=-p--;
		System.out.println(p);
		
		
	}

}
