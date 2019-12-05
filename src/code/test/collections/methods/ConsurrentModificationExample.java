package code.test.collections.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConsurrentModificationExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		/*
		 * for (Integer integer : list) { list.remove(integer); }
		 */
		
		  System.out.println(list);
		for(Iterator it=list.iterator(); it.hasNext();) {
			if((Integer) it.next()%2==0)
				it.remove();
		}
		
		list.removeIf(x->!(x%3==0));
		
		  System.out.println(list);
		 
		

	}

}
