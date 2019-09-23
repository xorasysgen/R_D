package code.java8.ext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*One line answer: flatMap helps to flatten a Collection<Collection<T>> into a Collection<T>. In the same way, it will also flatten an Optional<Optional<T>> into Optional<T>.*/
//https://stackoverflow.com/questions/26684562/whats-the-difference-between-map-and-flatmap-methods-in-java-8
public class FlatMapOrMap {

//	As you can see, with map() only:
//
//		The intermediate type is Stream<List<Item>>
//		The return type is List<List<Item>>
//		and with flatMap():
//
//		The intermediate type is Stream<Item>
//		The return type is List<Item>
	
	
	
	public static void main(String[] args) {
		String[] arrayOfWords = {"STACK", "OOOVVVER","ssushil","bhaskkkkaaar"};
		List<String[]> sssp=Arrays.stream(arrayOfWords).map(w->w.split("")).distinct().collect(Collectors.toList());// it does not work
		for (String[] strings : sssp) {
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
		}
		
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		List<String> sss=streamOfWords.map(s->s.split("")) //Converting word in to array of letters
	    .flatMap(Arrays::stream).distinct()  //Make array in to separate stream
		.collect(Collectors.toList());
		streamOfWords=Arrays.stream(arrayOfWords);
	    streamOfWords.map(s->s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::print);
  	    
	    for(int i=1; i<25; i++) {
	    	System.out.print("1^" + i +  " =  ");
	    	System.out.print(1^i*-1);
	    	System.out.println("");
	    	
	    }
	    

	}

}
