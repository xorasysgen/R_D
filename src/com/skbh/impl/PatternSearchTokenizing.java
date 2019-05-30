package com.skbh.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearchTokenizing {

	public static void main(String[] args) {
		String source="sxx";
		String pattern=".*?xx"; // .*xx
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(source);
		System.out.println(m.find());
		System.out.println(m.matches());
		
		

	}

}
