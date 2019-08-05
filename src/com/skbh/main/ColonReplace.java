package com.skbh.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColonReplace {

	public static void main(String[] args) {
		String string="{\"xfa:data\": {    \"labour:mainForm\": {        \"activitySpecific\": {            \"esic\": {                \"name-details\": {                    \"name-of-taluka-tehsil\": \"XXXXX\",                    \"revenue-husbast\": \"No\",                    \"town-village\": \"No\",                    \"name-of-town-village\": \"XXXXX\",                    \"taluka-tehsil\": \"No\",                    \"police-station\": \"gdfgdf\",                    \"name-of-municipality-ward\": \"XXXXX\",                    \"name-of-revenue-husbast\": \"XXXXX\",                    \"municipality-ward\": \"No\"                },";
		Pattern p=Pattern.compile("\\w+:");
		//Pattern p=Pattern.compile("\\w+:");
		//Pattern p=Pattern.compile(":");
		Matcher m=p.matcher(string);
		System.out.println(m.replaceAll(""));
		
	}

}
