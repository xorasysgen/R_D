package code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTwo {

	public static void main(String[] args) {
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("b").add("b").add("c").build();
		System.out.println(streamBuilder.distinct().collect(Collectors.toList()));
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		System.out.println(streamGenerated.collect(Collectors.toList()));
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 1).limit(20);
		System.out.println(streamIterated.collect(Collectors.toList()));
		String [] s={"2","1"};
		List<String> list=Arrays.asList(s);
		Optional<String> stream = list.stream().filter(element -> {
		    System.out.println("filter() was called");
		    return element.contains("2");
		}).map(element -> {
			System.out.println("map() was called");
		    return element.toUpperCase();
		}).findFirst();
		
	}
	

}
