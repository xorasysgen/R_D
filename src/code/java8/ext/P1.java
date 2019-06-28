package code.java8.ext;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;

public class P1 {
	
	private List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	private List<Integer> finalList;
	
	public void forEach() {
	   list=new CopyOnWriteArrayList<>(list);
	   finalList=Collections.unmodifiableList(list);
	   finalList.forEach((x)-> {
		   if(x%2==0)
			   System.out.println(x);
		   });
	   int result = finalList.stream()
	   .filter(p -> p%2==0)
	   .mapToInt(m-> m+2)
	   .sum();
	   System.out.println("result#" + result);
	   
	   finalList.stream()
			   .filter(p -> p%2==0)
			   .map(m -> m+2)
			   .forEach(x-> list.add(x));
	    		System.out.println("Final List" + finalList);
	    		System.out.println("List" + list);
	   
	}
	
	public static void main(String[] args) {
		new P1().forEach();
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
