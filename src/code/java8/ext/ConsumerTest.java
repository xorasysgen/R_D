package code.java8.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> consumer=r->System.out.print(r + " \t ");
		Predicate<Integer> predicate=r->r%2!=0;// affirmative or negative
		consumer.accept(10);
		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,53,22,2));
		list.stream().forEach(consumer);
		System.out.println();
		list.stream().filter(predicate).forEach(consumer);
		
	}

}
