package code.java8.ext;

import java.util.HashSet;

public class SetTest {

	
	private static void setTestMethod() {
		
		HashSet<String> list=new HashSet<String>();
		list.add("sushil");
		list.add(null);
		list.add("sushil2");
		list.add("sushil4");
		list.add("sushil5");
		list.remove("sushil2");
		list.remove(null);
		System.out.println(list);
		
		for (String string : list) {
		System.out.println(string);	
		}
	}
	public static void main(String[] args) {
		SetTest.setTestMethod();
	}

}
