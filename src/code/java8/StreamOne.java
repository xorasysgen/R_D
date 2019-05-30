package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Test{
	public abstract int get(int x,int y);
	default String defaultMethodOverridden() {
		return "default one";
	} 
		
	default String defaultMethodOverridden1() {
		return "default two";
	}
	
	static int defaultMethodInt() {
		return 0;
	}
}	

public class StreamOne  implements Test {

	public static void main(String[] args) {
		
		Integer [] i= {123,45,67,8,9,45,242,6546,786,2,123,25,78,-1,0,-226};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(i));
		System.out.println(list);
		Collections.sort(list, (a,b)-> a.compareTo(b));
		System.out.println(list);
		list.sort((a,b)->b.compareTo(a));
		System.out.println(list);
		Stream<Integer> stream=list.stream().filter(ii->ii.equals(242));
		System.out.println(stream.collect(Collectors.toList()));
		/*Any interface with a SAM(Single Abstract Method) is a functional interface,
		and its implementation may be treated as lambda expressions.*/
		Test t=(x,y)-> x*y;
		System.out.println(t.get(5, 7));
		Test t1=(x,y)-> x+y;
		System.out.println(t1.get(5, 7));
		System.out.println(t1.defaultMethodOverridden());
		System.out.println(Test.defaultMethodInt());
		
		
	}

	@Override
	public int get(int x,int y) {
		return 0;
	} 

}
