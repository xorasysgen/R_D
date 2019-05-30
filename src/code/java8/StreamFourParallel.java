package code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFourParallel {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(1,25, "potatoes"),
				  new Product(2,25, "orange"), new Product(3,6, "lemon"),
				  new Product(4,8, "bread"), new Product(5,40, "sugar"),
				  new Product(6,8, "butter"), new Product(7,6, "banana"));
		List<String> newList=productList.stream()
				.map(Product::getProduct)
				.collect(Collectors.toList());
		System.out.println(newList);
		Double priceAverage=productList.stream()
		.collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(priceAverage);//Processing the average value of all numeric elements of the stream:
		int sum=productList.stream()
				.collect(Collectors.summingInt(Product::getPrice));
		System.out.println(sum);//Processing the sum of all numeric elements of the stream:

		Map<Integer,List<Product>> group=productList.stream()
		.collect(Collectors.groupingBy(Product::getPrice));
		System.out.println(group);
		
		Map<Boolean, List<Product>> mapPartioned = productList.stream()
				  .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));
		System.out.println(mapPartioned);
		//source fo study
		//https://www.baeldung.com/java-8-streams
		System.out.println("new str*eam parallel processing");
		
		
	}

}
