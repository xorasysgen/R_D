package code.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFiveOracleHelp {

	public static void main(String[] args) {
		
	/*	Java 8 - Lambda Expression
		Java 8 - Default Methods
		Java 8 - Functions
		Java 8 - Method Reference
		Java 8 - Stream Count
		Java 8 - Stream with Filter
		Java 8 - Stream with Map
		Java 8 - Stream with Sorted
		Java 8 - Stream with Match
		Java 8 - Stream Reduce
		Java 8 - Stream Consumer
		Java 8 - Predicate
		Java 8 - Comparator
		Java 8 - Suppliers*/
		
		List<Product> productList = Arrays.asList(new Product(1,25, "potatoes"),
				  new Product(2,25, "orange"), new Product(3,6, "lemon"),
				  new Product(4,8, "bread"), new Product(5,40, "sugar"),new Product(10,58, "bread"),
				  new Product(6,8, "butter"), new Product(7,6, "banana"),new Product(8,6, "apple"),new Product(9,25, "kiwi"));
		List<String> itemName=productList.stream()
				.filter(x->x.getPrice()>=10) 
				.sorted(Comparator.comparing(Product::getPrice).reversed())
				.map(Product::getProduct)
				.collect(Collectors.toList());
		
		System.out.println(itemName);
		
		List<Product> itemName1=productList.parallelStream()
				.sorted(Comparator.comparing(Product::getPrice))
				.collect(Collectors.toList());
		
		System.out.println(itemName1);
		List<Product> newList=productList.subList(1, 3);
		System.out.println(newList);
		//https://www.concretepage.com/java/jdk-8/java-8-stream-sorted-example
		List<Integer> list=Arrays.asList(10,28,3,4,5,6);
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		//count no of similar words
		List<String> s=Arrays.asList("sushil","kumar","bhaskar","sushil","apple","mango","apple","apple");
		Map<String, Long> m=s.stream()
							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m);
		//count no of similar character
		Map<String, Long> m1=s.stream().map(x->x.split("")).flatMap(Arrays::stream)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m1);
		

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15,16,17,18);
		List<Integer> twoEvenSquares = 
		    numbers.parallelStream()
		           .filter(n -> {
		                    System.out.println("filtering " + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .limit(5)
		           .sorted(Comparator.reverseOrder())
		           .collect(Collectors.toList());
		twoEvenSquares.forEach(a->System.out.println(a));

		Map<String,List<Product>> group=productList.stream()
				.collect(Collectors.groupingBy(Product::getProduct));
		System.out.println(group);
		

	}

}
