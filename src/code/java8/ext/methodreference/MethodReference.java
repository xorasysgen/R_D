package code.java8.ext.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;


@FunctionalInterface
interface Util {
	
	  String get(String s); //SAM
	  boolean equals(Object other);
	  int hashCode();
	  String toString();
	static String upperCase(String s) {
		return s.toUpperCase();
	}
	
	default String upperCase1(String s) { return s.toUpperCase(); }
}


class UtilClass {
	String upperCase(String s) {
		return s.toUpperCase();
	}
}

public class MethodReference {

	public static void main(String[] args) {
		UtilClass utilClassObject=new UtilClass();
		Function<String, String> f = (s) -> Util.upperCase(s);
		List<String> list = Arrays.asList("sushil", "kumar", "bhaskar");
		list.forEach((s)-> System.out.println(s));
		list.forEach(System.out::println);
		System.out.println(list.stream().map((s) -> Util.upperCase(s)).collect(Collectors.toList()));
		System.out.println(list.stream().map(Util::upperCase).collect(Collectors.toList()));
		System.out.println(list.stream().map(utilClassObject::upperCase).collect(Collectors.toList()));
		Callable<List<String>> c =() ->  list.stream().map(f).collect(Collectors.toList());
		try {
			System.out.println(c.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		System.out.println(numbers);
		System.out.println(numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList()));

		Collections.reverse(numbers);
		System.out.println(numbers);
		
		String [] str= {"z","d","b","d","r","t","r"};
		//Arrays.sort(str,(a,b)-> a.compareTo(b));
		Arrays.sort(str,String::compareTo);
		System.out.println(Arrays.toString(str));
		

	}

}
