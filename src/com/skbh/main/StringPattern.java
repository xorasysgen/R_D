package com.skbh.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {

	public static void main(String[] args) {
		String str="sushil kumar bhaskar 2352 sushil 2352 kumar  [32523] sushil";
		Pattern pattern=Pattern.compile("[^a-z$]");// \\d+
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()){
			str=matcher.replaceAll(" ").replaceFirst("\\s+", "");
		}
		System.out.println(str);

		String newString="Hello +-^ my + -sdf23 friends ^ ^^-- ^^^ +!";
		System.out.println(newString.replaceAll("[^a-zA-Z0-9]", ""));
		
		
	}

}
