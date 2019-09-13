package code.java8.ext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	private static List<Integer> list= Arrays.asList(1,34,5,6,77,543,23332,332,2,2,1,13,67,4,11,3,4,34,3,19,59);
	
	private  static void streamMethod() {
		System.out.println(list.stream()
		.filter(StreamTest::isPrime)
		.filter(x->x%2!=0)
		.distinct()
		.sorted()
		.collect(Collectors.toList()));
		System.out.println(list.stream().count());
		
	}
	
	private static boolean isPrime(int number) {
		if(number<2)
			return true;
		for(int x=2;x<Math.sqrt(number);x++) {
			if(number%x==0)
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		new StreamTest().streamMethod();

	}

}
