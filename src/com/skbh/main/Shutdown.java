package com.skbh.main;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.DatatypeConverter;


public class Shutdown {
	public static String toBase64(String data) {
	    return DatatypeConverter.printBase64Binary(data.getBytes());
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) throws UnsupportedEncodingException {
		//	System.out.println(Shutdown.toBase64("sushil"));
		String str=Shutdown.toBase64("shutdown -s -t 0");
		System.out.println(str);
		byte[] encodedHelloBytes = DatatypeConverter.parseBase64Binary(str);
	    String helloAgain = new String(encodedHelloBytes, StandardCharsets.UTF_8) ;
	    System.out.println(helloAgain);
		Runtime rt = Runtime.getRuntime();
	       //try {
			//rt.exec("shutdown -s -t 0");
		//} //catch (IOException exceptionObject) {
			// TODO Auto-generated catch block
			//exceptionObject.printStackTrace();
		//}

	}

}
