package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class JavaEight {
	
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(new Integer[] {1,2,5,89,6,58,-5,1,7});
		list.sort((o1,o2)-> o1.compareTo(o2));
		list.forEach(v->System.out.print(v + " "));
		List<String> names = new ArrayList<>();
		names.add("Larry");
		names.add("Steve");
		names.add("Sllen");
		names.add("James");
		names.add("Conan");
		names.add("Ellen");
		names.add("Sonan");
	
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				System.out.println(arg0);
				
			}
		    
		});
		names.forEach(v->System.out.println(v)); /*Internal Iterator*/
		/*for (String string : names) { External Iterator
			System.out.println(string);
		} */
		
		List<String> filterdList=names.stream()
								.filter(name->name.startsWith("S"))
								.collect(Collectors.toList());
		System.out.println(filterdList);
		filterdList.replaceAll(name->name.toLowerCase());//to lower
		filterdList.replaceAll(String::toLowerCase);//other shortcut to lower
		System.out.println(filterdList);
		filterdList.clear();
		System.out.println("sdg" + filterdList);
		System.out.println(names);
		
		List<Integer> test=new ArrayList<>(Arrays.asList(5,8,39,2,6));
		List<Integer> processed=test.stream().map(s->s*s).collect(Collectors.toList());
		List<Integer> sort=test.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);
		System.out.println(processed);
				
	}


}
