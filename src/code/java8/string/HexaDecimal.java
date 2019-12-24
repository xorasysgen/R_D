package code.java8.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;

import com.google.common.io.BaseEncoding;





public class HexaDecimal {

	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for (int j = 0; j < bytes.length; j++) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = HEX_ARRAY[v >>> 4];
	        hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
	byte[] s=new String("सेवा").getBytes(StandardCharsets.UTF_8);
	System.out.println(new String(s,StandardCharsets.UTF_8));
	System.out.println(s.length);
	System.out.println(Hex.encodeHex(s));
	System.out.println(HexaDecimal.bytesToHex(s));
	System.out.println(javax.xml.bind.DatatypeConverter.printHexBinary(s));
	System.out.println(new String(javax.xml.bind.DatatypeConverter.parseHexBinary(HexaDecimal.bytesToHex(s))));
	System.out.println(BaseEncoding.base16().encode(s));
	System.out.println(HexaDecimal.toHex("ABCD".getBytes()));
	}
	
	static String toHex(byte[] digest) {
	    StringBuilder sb = new StringBuilder();
	    for (byte b : digest) {
	        sb.append(String.format("%1$02X", b));
	    }

	    return sb.toString();
	}

}
