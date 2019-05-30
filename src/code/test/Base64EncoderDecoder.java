package code.test;

import org.apache.commons.codec.binary.Base64;

public class Base64EncoderDecoder {

	
	/* .inMemoryAuthentication()
	 .withUser("root").password("{noop}boot@101#$").authorities("ROLE_USER").and()  //{noop}
	 .withUser("jsr").password("{noop}jsr@101#$").authorities("ROLE_USER", "ROLE_ADMIN").and()
	 .withUser("sandeep").password("{noop}sandeep@101#$").authorities("ROLE_USER").and()
	 .withUser("dinesh").password("{noop}dinesh@101#$").authorities("ROLE_USER").and()
	 .withUser("ranjeet").password("{noop}ranjeet@101#$").authorities("ROLE_USER").and()
	 .withUser("bimlesh").password("{noop}bimlesh@101#$").authorities("ROLE_USER");*/
	
	
	public static void main(String[] args) {
		byte[] encodedBytes = Base64.encodeBase64("bimlesh@101#$".getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));
		System.out.println(Base64EncoderDecoder.encoder("bimlesh@101#$"));
		System.out.println(Base64EncoderDecoder.decoder("YmltbGVzaEAxMDEjJA==".getBytes()));
	}
	
	public static String encoder(String cipher) {
		byte[] encodedBytes = Base64.encodeBase64(cipher.getBytes());
		return new String(encodedBytes);
	}
	
	public static String decoder(byte[]  encodedBytes) {
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		return new String(decodedBytes);
	}

}
