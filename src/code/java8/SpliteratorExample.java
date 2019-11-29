package code.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpliteratorExample {

	public static void main(String[] args) {
		IntStream i=IntStream.range(0, 500000);
		List<Integer> list=i.boxed().collect(Collectors.toList());
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();

		/*
		 * for(Spliterator<Integer> split=list.spliterator();
		 * split.tryAdvance(System.out::print);); System.out.println();
		 */

		Spliterator<Integer> split=list.spliterator();
		Spliterator<Integer> split2=split.trySplit();
		Spliterator<Integer> split3=split.trySplit();
		split.forEachRemaining((t)-> {	if(t%2!=0)	odd.add(t); else even.add(t); });
		System.out.println();
		split2.forEachRemaining((t)-> {	if(t%2!=0)	odd.add(t); else even.add(t); });
		System.out.println();
		split3.forEachRemaining((t)-> {	if(t%2!=0)	odd.add(t); else even.add(t); });
		System.out.println("odd" + odd);
		System.out.println("Even" + even);
		
	}

}
