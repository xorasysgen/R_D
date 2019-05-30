package code.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Shuffle {

	
	private static String doShuffle(String source) {
		char [] s1=source.toCharArray();
		String temp = "";
		Map<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < 50; i++) {
			int key=new Random().nextInt(s1.length);
			if(map.put(key, key)==null) {
				temp= s1[key] + "" + temp;
			}
		}
		System.out.println("Row #" +  temp);
		return temp;
		
	}
	
	private static boolean stringSuffle(String s1, String s2) {
	final String source=s1.concat(s2);
	char [] cc1=s1.toCharArray();
	char [] cc2=s2.toCharArray();
	String p1="";
	String p2="";
	String temp1=cc1[0]+"";
	String temp2=cc2[0] + "";
	for (int i = 1; i < s1.length(); i++) {
		p1=cc1[i]+ ""+  p1;
		p2=cc2[i]+ ""+  p2;
	}
	
	String target=temp2.concat(temp1);
	target=target.concat(doShuffle(p1).concat(doShuffle(p2)));
	System.out.println("Input  " + source);
	System.out.println("Suffle  " + target);
	char [] c1=source.toCharArray();
	char [] c2=target.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(c1);
	System.out.println(c2);
	if(Arrays.equals(c1, c2))
		return true;
	else
		return false;
		
	}
	
	public static void main(String[] args) {
		if(stringSuffle("abcrty","defrty")) {
			System.out.println("both are similar");
		}
		else
			System.out.println("both are diffrent");

	}

}
