package code.java8;

import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;


/*1. Immutable wrapper class
2. it is singleton class
3. There are only two states isPresent or Empty
4. Never ever use null as a return value to optional
5. not serialization
6. it is box, takes 16 bytes of memory.
7. eleminating NULL is not the goal of optional*/

public class OptionalExample {

	private Optional<String> loadUser(){
		int i=new Random().nextInt(10);
		System.out.println(i);
		if(i>10)
		return Optional.of("sushil");		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<String> nullName = new OptionalExample().loadUser();
		 String name=nullName.isPresent() ? nullName.get(): "not found";
		 String name2 = nullName.orElse("or else found");
	    String name3 = nullName.orElseGet(() -> "default john");
	    nullName.orElseThrow(IllegalAccessError::new);
	    System.out.println(name);
	    BiFunction f;
	    System.out.println(name2);
	    System.out.println(name3);
	}

}
