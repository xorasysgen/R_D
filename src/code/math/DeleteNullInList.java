package code.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteNullInList {

	public static void deleteNullValues() {
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("one",null,"two","three",null,"","","null","null"));
		
		System.out.println(list);
		while(list.remove(null) || list.remove("null") || list.remove(""));
		System.out.println(list);
		

	}

}
