package code.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteNullInList {

	public static void deleteNullValues() {
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("one",null,"two","three",null,"","",null,null));
		
		System.out.println(list);
		//while(list.remove(null) || list.remove("null") || list.remove("")); // way one
		//list.removeAll(Collections.singleton(null));
		//list=list.parallelStream().filter(x->x!=null).collect(Collectors.toList());
		//list=list.parallelStream().filter(Objects::nonNull).collect(Collectors.toList());
		list.removeIf(Objects::isNull); //removes null value
		//list.removeIf(Objects::nonNull);//removes non null
		System.out.println(list);
		
		
		

	}

}
