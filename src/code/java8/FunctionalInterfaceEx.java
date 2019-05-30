package code.java8;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceEx {
		public static void main(String[] args) {
		List<Person> list=FunctionalInterfaceEx.getdbList();
		list.sort((Person o1,Person o2)->  o1.getLastName().compareTo(o2.getLastName()));
			
		System.out.println("-----------------------");
		list.forEach(v->System.out.println(v));
		System.out.println("-----------------------");
		//FunctionalInterfaceEx.printList(list);
		list.stream()
		.filter((s)->s.getLastName().startsWith("B"))
		.forEach(System.out::println);
		
	}
		
	public static List<Person> getdbList(){
		List<Person> dbList=Arrays.asList(
				new Person("Susanta","Pradhan","9869532694"),
				new Person("sushil","Bhaskar","9999439248"),
				new Person("Anurag","Bhaskar","9869632589"),
				new Person("Ranjeet","Pradhan","8869632585"));
		return dbList;
	} 
}
