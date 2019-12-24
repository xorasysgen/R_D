package com.skbh.main;

import java.nio.charset.StandardCharsets;

public class ByteArrayTest {

	public static void main(String[] args) {
		String string="String to byte array dsafg gs gs dgsd gsd@#$%^^&*543355()";
		byte[] byteData=string.getBytes();
		System.out.println(byteData);
		System.out.println(new String(byteData, StandardCharsets.UTF_8));
				
	}

}
