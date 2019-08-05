package code.test.collections.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		List<T> list=new ArrayList<>();
		list.add((T) "sushil");
		list.add((T) new Integer(2));
		list.add((T) new Double(20.222));
		System.out.println(list);
		System.err.println(list);

	}

}
