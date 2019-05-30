package code.java8;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamThree {

	public static void main(String[] args) {
	/*iterator in stream Api*/
	
	Stream<Integer> stream=Stream.iterate(1, i->i+1).limit(10);
	System.out.println(stream.collect(Collectors.toList()));
	Stream<String> streamPattern=Pattern.compile(",").splitAsStream("a,b,c,d,e,f,a,b,c,r,d,,,,,a,a").distinct();
	System.out.println(streamPattern.collect(Collectors.toList()));
	}

}
