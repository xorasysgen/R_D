package code.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniqueElements {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
		super.finalize();
	}

	public List<Integer> findUniqueElements(Integer[] ar) {
		if (ar != null && ar.length > 0) {
			List<Integer> list = Arrays.asList(ar);
			List<Integer> result = new ArrayList<>();
			for (Integer integer : list) {
				if (Collections.frequency(list, integer) == 1) {
					result.add(integer);
				}
			}
			return result;
		}
		return null;
	}

	public static void main(String[] args) {
		Integer[] ar = { 2, 2, 3, 3, 4, 5, 5, 6, 6, 9, 9, 10 };
		FindUniqueElements findUniqueElements=new FindUniqueElements();
		System.out.println(findUniqueElements.findUniqueElements(ar));
		findUniqueElements=null;
		System.gc();
		FindUniqueElements findUniqueElements2=new FindUniqueElements();
		System.out.println(findUniqueElements2.findUniqueElements(ar));
		findUniqueElements2=null;
		Runtime.getRuntime().gc();
	}

}
