package code.java8;

import java.util.ArrayList;	
import java.util.Arrays;
import java.util.List;

public class BaeldungJ9_remove_one_line {

	public static void  removeNullValuesFromList() {
		List<Integer> unList=new ArrayList<Integer>(Arrays.asList(1,2,null,3,4,5,5,6,7,8,null,89,9,0,0,4,6,4,5,5,null));
		
		Integer i=5;
		while(unList.remove(null) && unList.remove(i))
		
		System.out.println(unList);
		while(unList.remove(null));
		
		System.out.println(unList);
				
	}
	
	public static void main(String[] args) {
		BaeldungJ9_remove_one_line.removeNullValuesFromList();
		
		
	}

}
