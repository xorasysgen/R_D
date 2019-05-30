package com.skbh.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public static String removeSpecialAndBugyCharacters(String character){
		@SuppressWarnings("static-access")
		Pattern pattern=Pattern.compile("^[\u0000]*$").compile("[:!#$%^&*/*+{};<>\"\"\'\']").compile("\u0000").compile("<(\"[^\"]*\"|'[^']*'|[^'\">])*>");
		Matcher m=pattern.matcher(character);
		character=m.replaceAll("").trim();
		return character;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Reg.removeSpecialAndBugyCharacters("<html>Test result<html>"));

	}

}
