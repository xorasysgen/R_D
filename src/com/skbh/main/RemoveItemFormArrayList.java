package com.skbh.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveItemFormArrayList {

	public static void main(String[] args) {
		//List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10); //fixed size list cannot remove or add value to it 
		List<Integer> values=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		values.add(111);
		values.add(222);
		values.add(333);
		values.add(444);
		System.out.println(values);
		try{
		values.remove(values.indexOf(333));
		}
		catch(ArrayIndexOutOfBoundsException ar){
			System.out.println("Element not found!");
		}
		
		System.out.println(values);
		
	}

}
