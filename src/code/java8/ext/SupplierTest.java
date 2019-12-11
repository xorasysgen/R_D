package code.java8.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;


public class SupplierTest  implements Supplier<String> {

	@Override
	public String get() {
		return "Configuration";
	}
	
	public static void main(String[] args) {
		String op="sushil";
				Optional.of(op);
		Supplier<String> s=new SupplierTest();
		System.out.println(s.get());
		Supplier<String> s1=()-> {return "default";};
		
		System.out.println(s1.get());
		List<String> list=new ArrayList<String>(Arrays.asList("hi","hello","hmm","bye"));
		List<String> list2=new ArrayList<String>(Arrays.asList());
		System.out.println(list.stream().findAny().orElseGet(s1));
		System.out.println(list2.stream().findAny().orElseGet(()-> "Default 1"));
		
	}

}
