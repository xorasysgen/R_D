package code.test.collections.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMethods {

	private static List<Integer> list1;
	private static List<Integer> list2;
	
	
	
	static {
		list1=new ArrayList<>();
		list2=new ArrayList<>();
	}
	
	static void createList() {
		
		System.out.println("Creating Lists");
		for (int i = 1; i < 10; i++) {
			list1.add(i);
			list2.add(i+3);
			
		}
		list1.add(89);
		
		
		
	} 
	
	public static void main(String[] args) {
		createList();
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.removeAll(list2));
		System.out.println(list1);	
		System.out.println(list1.retainAll(list2));
		System.out.println(list1);
		System.out.println(list2);
		
		
		 List<Integer> list1=new ArrayList<>();
		 List<Integer> list2=new ArrayList<>();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 list1.add(4747);
		 
		 list2.add(1);
		 list2.add(3);
		 list2.add(447);
		 
		 System.out.println(list1.removeAll(list2));
			System.out.println(list1);
			System.out.println(list2);
			
			 List<Integer> temp=Collections.singletonList(5);
			 System.out.println(temp);
			 Integer [] a= {2,3,4,5,6,65};
			 List<Integer> temp1=new ArrayList<>(Arrays.asList(a));
			 temp1.add(2424);
			 System.out.println(temp1);
			 

	}

}
