package code.java8.ext;

import java.util.ArrayList;

public class StreamFilter_3 {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("first");
		list.add("Second");
		list.add(null);
		list.add("Third");
		list.add(null);
		list.add("four");
		list.add("five");
		list.add(null);
		
		System.out.println(list);
		while(list.remove(null));
		System.out.println(list);
			
		list.forEach((x)->System.out.print(x + " "));
		
		list.stream()
		.filter(text-> !"Second".equals(text))
		.forEach(System.out::println);
		
		String s=list.stream()
		.filter(text->!"Second".equals(text))
		.findAny()
		.orElse(null);
		
		System.out.println(s);
		
		

	}

}
