package code.java8;

import java.util.StringJoiner;

public class Java8String {

	public static void main(String[] args) {
		StringJoiner strJoiner = new StringJoiner(",");
		strJoiner.add("Buggy").add("Bread").merge(strJoiner);
		System.out.println(strJoiner); // prints Buggy.Bread
		StringJoiner jr=new StringJoiner(",");
		jr.merge(strJoiner);
		String s=jr.add("add1").add("add2").toString();
		System.out.println(s);
		String a="abc456";
		String b="def$%^$^#-";
		a=a.concat(b);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length(), a.length());
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
