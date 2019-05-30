package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TakeWhileDropWhile {

	
	public static void takeWhile(List<Integer> list) {
		
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,14,5,3,6,9,8,4));
		TakeWhileDropWhile.takeWhile(list);

	}

}
