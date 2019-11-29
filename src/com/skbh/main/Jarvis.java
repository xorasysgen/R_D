package com.skbh.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.DatatypeConverter;

public class Jarvis {
	
	public static void main(String[] args) {
	  	try {
			showBegins();
		} catch (IOException exceptionObject) {
			exceptionObject.printStackTrace();
		}
	  	System.out.println("Bye bye, System is shutting down in less than a minute");

	}

	/**
	 * @throws IOException
	 */
	private static void showBegins() throws IOException {
		Runtime.getRuntime().exec(new String(DatatypeConverter.parseBase64Binary("c2h1dGRvd24gLXMgLXQgMTA="), StandardCharsets.UTF_8));
	}

}


/*
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.DatatypeConverter;

public class Jarvis {

	public static String toBase64(String data) {
	    return DatatypeConverter.printBase64Binary(data.getBytes());
	}

	
	public static void main(String[] args) {
		String database="c2h1dGRvd24gLXMgLXQgMA==";
		byte[] encodedHelloBytes = DatatypeConverter.parseBase64Binary(database);
	  
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec(new String(encodedHelloBytes, StandardCharsets.UTF_8));
		} catch (IOException exceptionObject) {
			// TODO Auto-generated catch block
			exceptionObject.printStackTrace();
		}
		 System.out.println("Bye bye...");

	}

}
*/