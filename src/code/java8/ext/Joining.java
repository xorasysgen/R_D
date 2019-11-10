package code.java8.ext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String csv=G7.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(csv);
		String lower=G7.stream().map(x->x.toLowerCase()).collect(Collectors.joining(","));
		System.out.println(lower);
		

	}

}
