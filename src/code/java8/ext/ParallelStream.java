package code.java8.ext;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ParallelStream {
	private static void parallelSteram() {
	int [] values= {1,1,4,7,8,9,3,4,2,2,0,1,1};
	
	List<Integer> list=IntStream.of(values)
						.distinct()
						.sorted()
						.limit(5)
						.boxed()
						.collect(Collectors.toList());
	
	Collections.reverse(list);
	System.out.println(list);
	}
	
	public static void main(String[] args) {
		ParallelStream.parallelSteram();

	}

}
