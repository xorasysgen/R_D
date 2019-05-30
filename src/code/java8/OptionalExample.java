package code.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String nullName = "sushil";
		String nullName1 = null;
		 String name = Optional.ofNullable(nullName).orElse("");
	    String name1 = Optional.ofNullable(nullName1).orElseGet(() -> "john");
	    System.out.println(name);
	    System.out.println(name1);
	}

}
