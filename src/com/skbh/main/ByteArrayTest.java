package com.skbh.main;

import java.nio.charset.StandardCharsets;

public class ByteArrayTest {

	public static void main(String[] args) {
		String string="String to byte array";
		byte[] byteData=string.getBytes();
		System.out.println(byteData);
		System.out.println(new String(byteData, StandardCharsets.UTF_8));
				
	}

}
