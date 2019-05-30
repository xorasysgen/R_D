package com.skbh.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearch {

	public static String searchPattern(String pattern, String StringToSearch) {
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(StringToSearch);
		if(m.find()) {
		System.out.println("pattern found");
		}
		while(m.find()) {
			System.out.println("----------------");
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("----------------");
		}
		
		System.out.println(m.toMatchResult());
		return "";
		
	}
	
	
	public static void main(String[] args) {
		String pattern="^[0-9]{10}";
		String search="1234567890";
		PatternSearch.searchPattern(pattern, search);
	}

}
