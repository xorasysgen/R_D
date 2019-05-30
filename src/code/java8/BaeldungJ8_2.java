package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaeldungJ8_2 {

	public static void main(String[] args) {
		String [] arr= {"sushil","kumar","bhaskar"};
		//Joining Strings with the Stream API
		System.out.println(Arrays.asList(arr).stream().collect(Collectors.joining(",","preFix "," suFix")));//return string by joining
		
		String s="sushil kumar bhaskar";/*Splitting Strings with Stream API*/
		List<String> slist=Stream.of(s.split(","))
		.map(m->new String(m))
		.collect(Collectors.toList());
		System.out.println(slist);
		
		List<Character> c=s.chars()
						.mapToObj(map->(char)map)
						.collect(Collectors.toList());
		System.out.println(c);
		
		List<String> names=Arrays.asList(arr);//find String length to map
		Map<String,Integer> length=names.stream()
		.collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(length);
		
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");
		 
		Stream<String> stream = valueList.stream();
		stream.reduce((first, second) -> second)
		  .orElse(null);
		System.out.println(stream.parallel().collect(Collectors.toList()));

		
		Supplier<Stream<String>> streamSupplier 
		  = () -> Stream.of("A", "B", "C", "D");
		Optional<String> result1 = streamSupplier.get().findAny();
		System.out.println(result1.get());
		Optional<String> result2 = streamSupplier.get().findFirst();
		System.out.println(result2.get());
		
	}

}
