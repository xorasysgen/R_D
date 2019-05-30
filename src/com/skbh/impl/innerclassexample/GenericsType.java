package com.skbh.impl.innerclassexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sushil K Bhaskar
 *
 * @param <T>
 */
public class GenericsType<T> {

	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}



	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.setT("Pankaj"); //valid
		GenericsType type1 = new GenericsType(); //raw type
		type1.setT("Pankaj"); //valid
		type1.setT(10); //valid and autoboxing support
		type1.setT(89.569); //valid and autoboxing support
		System.out.println(type1);
		
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GenericsType [t=");
		builder.append(t);
		builder.append("]");
		return builder.toString();
	}
	
	
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
}