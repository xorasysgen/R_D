package com.skbh.main;

public class StringTestAll {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		String s = "abc";
		if(s.equals(sb)) {
			System.out.println(true);
		}else
			System.out.println(false);
		
		sb.reverse().append("d");
		s.toUpperCase().concat("d");
		
		System.out.println("." + sb + ". ." + s + ".");
	}

}
