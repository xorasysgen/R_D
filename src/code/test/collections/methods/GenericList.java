package code.test.collections.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static <T> void main(String[] args) {
		List<T> list=new ArrayList<>();
		list.add((T) "sushil");
		list.add((T) new Integer(2));
		System.out.println(list);
		System.err.println(list);

	}

}
