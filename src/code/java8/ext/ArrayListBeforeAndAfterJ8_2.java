package code.java8.ext;

import java.util.ArrayList;

public class ArrayListBeforeAndAfterJ8_2 {

	private static void test() {
		ArrayList<String> list=new ArrayList<>();
		list.add("first");
		list.add("Second");
		list.add(null);
		list.add("Third");
		list.add("four");
		list.remove("Five");
		list.remove(0);
		
		list.add("sushil");
		
		for (String x: list) { // in java 7
			System.out.println(x!=null && x.length()>0 ? x :"");
		}
		
		list.forEach((x)-> 	System.out.println(x!=null && x.length()>0 ? x :"")); // in java 8
		
	}
	
	public static void main(String[] args) {
		ArrayListBeforeAndAfterJ8_2.test();

	}

}
