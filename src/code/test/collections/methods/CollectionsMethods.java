package code.test.collections.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveAction;


class Execute extends  RecursiveAction{

	@Override
	protected void compute() {
		System.out.println("sushil");
		
	}
	
}

public class CollectionsMethods {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,2,5));
		List<Integer> list2 =Arrays.asList(11,22,33);
		System.out.println(Collections.disjoint(list,list2));
		System.out.println(list.removeAll(Collections.singleton(2)));
System.out.println(list);

new Execute().compute();;
	}

}
