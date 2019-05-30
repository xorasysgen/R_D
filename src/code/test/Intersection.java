package code.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	
public static List<Integer> findUnion(Integer [] one,Integer[] two) {
		
		if(one!=null && one.length>0 && two!=null && two.length>0) {
			List<Integer> list1=new ArrayList<>(Arrays.asList(one));
			List<Integer> list2=new ArrayList<>(Arrays.asList(two));
			List<Integer> result=new ArrayList<>();
			for (Integer integer : list1) {
				if(Collections.frequency(list2, integer)==0)
					result.add(integer);
				
			}
			
			for (Integer integer : list2) {
				if(Collections.frequency(list1, integer)==0)
					result.add(integer);
				
			}
			return result;
		}
		return null;
	}
	
	
public static List<Integer> findIntersection(Integer [] one,Integer[] two) {
		
		if(one!=null && one.length>0 && two!=null && two.length>0) {
			List<Integer> list1=new ArrayList<>(Arrays.asList(one));
			List<Integer> list2=new ArrayList<>(Arrays.asList(two));
			List<Integer> result=new ArrayList<>();
			for (Integer integer : list1) {
				if(Collections.frequency(list2, integer)==1)
					result.add(integer);
				
			}
			return result;
		}
		return null;
	}
	
	
	public static Set<Integer>  RemoveDuplicate(Integer [] one,Integer[] two) {
		Set<Integer> set=null;
		if(one!=null && one.length>0 && two!=null && two.length>0) {
			 set=new HashSet<>(Arrays.asList(one));
			set.addAll(new HashSet<>(Arrays.asList(two)));
		}
		return set;
	}
	
	
	
	public static void main(String[] args) {
		Integer [] a= {1,2,3,4,7,9};
		Integer [] b= {1,2,5,8,7,9,4};
		
		System.out.println(findIntersection(a,b));
		System.out.println(findUnion(a,b));
		System.out.println(RemoveDuplicate(a,b));

	}

}
