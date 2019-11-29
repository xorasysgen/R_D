package code.math;

import java.util.Arrays;

public class Anagram {

	private static boolean FindAnagram(String string, String string2) {
		char[] s1=string.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] s2=string2.replaceAll("\\s", "").toLowerCase().toCharArray();
		if(s1.length!=s2.length)
		{
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2)? true : false;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(FindAnagram("keep","epek"));
		System.out.println(FindAnagram("school master","the class room"));

	}

	

}
