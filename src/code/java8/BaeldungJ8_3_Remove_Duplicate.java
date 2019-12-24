package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BaeldungJ8_3_Remove_Duplicate {
	
	static void print(int i) {
		System.out.println("i=" + i);
	} 
	
	public static void main(String[] args) {
		String s="SUSHILKUMARBHASKAR";
		IntStream istream=s.chars();
		System.out.println(istream.count());
		System.out.println("Code Points" + s.codePoints().mapToObj(c-> (char)c).collect(Collectors.toList()));
		List<Customer> customer=new Customer().getAllCustomer();
		//How can I get the last element of a stream?
		Customer cust=(customer.stream().reduce((a,b)->b).get());//last element in list
		System.out.println(cust);
		
		IntStream.range(1, 5).forEach(y->print(y));
		LongStream.range(1, 10).forEach(x->print((int)x));
		 
		//List<Integer> a=new ArrayList<>(Arrays.asList(1,null,33,null,45,2,1,2,46,8,9,3,22,0,null,56,43,34));
		List<Integer> a=new ArrayList<>(Arrays.asList(1,1,null,45,2,1,2,1,8,9,3,1,0,null,1,43,1,null));
		System.out.println(a.add(5));
		System.out.println(a.indexOf(8596));
		if(a.indexOf(8)!=-1) {
			System.out.println("value found" + a.get(a.indexOf(8)));
		}
		System.out.println(a);
		while (a.remove(new Integer(1)) || a.remove(new Integer(0))|| a.remove(null));//  remove null and other object
		System.out.println("after remove" + a);
		System.out.println(customer);
		while (customer.remove(null));//  remove null 
		System.out.println(customer);
		
		a.add(null);
		System.out.println("list#" + a);
		System.out.println("@ : " + a.indexOf(8963));
		if(a.indexOf(null)!=-1) {
			System.out.println("found : " + a.get(a.indexOf(null)));
		}
		
	}

}
