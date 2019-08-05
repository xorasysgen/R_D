package com.skbh.main;

import java.util.HashMap;
import java.util.Map;

class Keys {

	public static void v1() {
		System.out.println("v1 void parrent");
	}

	public static void v1(int one) {
		System.out.println("v1 int parrent");
	}

}

public class HashcodeLeakExample extends Keys {
	@SuppressWarnings("unused")
	private String id;

	public HashcodeLeakExample(String id) {
		this.id = id;
	}


	public static void v1() {
		System.out.println("v1 void ");
	}

	public static void v1(int one) {
		System.out.println("v1 int ");
	}

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		Map<HashcodeLeakExample, String> map = null;
		try {
			map = new HashMap<HashcodeLeakExample, String>();
			long i = 1;
			while (true) {
				String status = map.put(new HashcodeLeakExample("id"),
						"any value");
				System.out.println(i + " " + status);
				i++;
				if (i == 1000)
					break;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("MAp Size: " + map.size());
		Keys v=new HashcodeLeakExample("id");
		
		v.v1();
		v.v1(25);
	}

}