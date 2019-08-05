package com.skbh.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegPatternTest {
	
	@SuppressWarnings("static-access")
	private static String removeSpecialAndBugyCharacters(String character){
		Pattern pattern=Pattern.compile("^[\u0000]*$").compile("[:!@#$%^&*/*+{};<>\"\"\'\']");
		Matcher m=pattern.matcher(character);
		character=m.replaceAll("").trim();
		return character;
	}

	public static void main(String[] args) {
		System.out.println(RegPatternTest.removeSpecialAndBugyCharacters(":!@#$%^&*/*+{};\"\"\"\"<> \u0000 :!@#$%^&*/*+{};<> :id sushil \u0000 df s%$% /*+ \u0000 \' \' d"));
	}

}
