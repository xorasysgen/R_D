package com.skbh.impl.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Root{
	
	
	
}

public class Top extends Root {
	
	private Integer x;
	public void rootFun(Top r) {
	r.setX(500);
		
		System.out.println("top_fun");
	}
	
	public void test() {
		System.out.println("test_fun");
	}
	
	
	public static void main(String ... arg) {
		StringBuilder unchanged=new StringBuilder("sushil");
		System.out.println(unchanged.delete(2, 5));
		System.out.println(unchanged.insert(3,"test"));
		Top r=new Top();
		r.rootFun(r);
		System.out.println(r.getX());
		//r.test();// method not present in root
		String s="sushil";
		
		List<String> list=new ArrayList<String>(Arrays.asList("t","u","v"));
		
		list.removeIf(Objects::nonNull);
		System.out.println(list);
		boolean p=true;
		if(p) { 
			System.out.println("true");
		}
		else;{
			System.out.println("false");
		}
		
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer string) {
		this.x = string;
	}
}


