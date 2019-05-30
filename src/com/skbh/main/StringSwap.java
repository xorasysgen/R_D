package com.skbh.main;

public class StringSwap {

	public static void main(String[] args) {
		String a="First";
		String b="Second";
		int al=a.length();
		int bl=b.length();
		a=a.concat(b);
		b=a.substring(0, al);
		a=a.substring(al,al+bl);
		System.out.println(a);
		System.out.println(b);

	}

}

