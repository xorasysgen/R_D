package com.skbh.main;

import com.google.common.base.CharMatcher;


public class Patterntest {

	public static void main(String[] args) {
		String message="Illegal unquoted character ((CTRL-CHAR, code 10)): has to be escaped using backslash to be included in string value\n at [Source: org.glassfish.jersey.message.internal.ReaderInterceptorExecutor$UnCloseableInputStream@3d446b27; line: 7, column: 26]";
		String [] arr=message.split("\n");
		String []ma=arr[1].split(";");
		System.out.println(arr[0].concat(ma[1]));
		String str="\\u0000 \\cx 2 sushil <img  abcdefABCDEF src=&#x6a;&#x61;&#x76;&#x61;&#x73;&#x63;&#x72;&#x69;&#x70;&#x74;&#x3a;alert&#x28;39&#x29;>'";
		System.out.println(CharMatcher.JAVA_ISO_CONTROL.removeFrom(str));
		System.out.println(str.replaceAll("\\p{Cntrl}", ""));

	}

}
