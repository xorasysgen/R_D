package code.java8.ext;

import java.util.ArrayList;

public class ArrayListTest {

	private static void test() {
		ArrayList<String> list=new ArrayList<>();
		list.add("sushil");
		list.add("sushil2");
		list.add(null);
		list.add("sushil3");
		list.add("sushil4");
		list.remove("sushil2");
		list.remove(0);
		list.add("sushil");
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		ArrayListTest.test();

	}

}
