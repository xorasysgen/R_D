package code.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncoder {

    private static final char[] PASSWORD = "enfldsgbnlsngdlksdsgm".toCharArray();
    private static final byte[] SALT = { (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12, (byte) 0xde, (byte) 0x33,
            (byte) 0x10, (byte) 0x12, };

    public static void main(String[] args) throws Exception {
    	String bigShit="sushil@101#$";
        String originalPassword = bigShit;
        System.out.println("Original password: " + originalPassword);
        String encryptedPassword = encrypt(originalPassword);
        System.out.println("Encrypted password: " + encryptedPassword);
        String decryptedPassword = decrypt(encryptedPassword);
        System.out.println("Decrypted password: " + decryptedPassword);
    }

    public  static String encrypt(String property) throws GeneralSecurityException, UnsupportedEncodingException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.ENCRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return base64Encode(pbeCipher.doFinal(property.getBytes("UTF-8")));
    }

    
    public static String encoder(String cipher) {
		byte[] encodedBytes = Base64.encodeBase64(cipher.getBytes());
		return new String(encodedBytes);
	}
	
	public static String decoder(byte[]  encodedBytes) {
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		return new String(decodedBytes);
	}
    
    private static String base64Encode(byte[] bytes) {
        // NB: This class is internal, and you probably should use another impl
    	byte[] encodedBytes = Base64.encodeBase64(bytes);
        return new String(encodedBytes);
    }

    private static String decrypt(String property) throws GeneralSecurityException, IOException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.DECRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return new String(pbeCipher.doFinal(base64Decode(property)), "UTF-8");
    }

    private static byte[] base64Decode(String property) throws IOException {
    	byte[] decodedBytes = Base64.decodeBase64(property);
		return decodedBytes;
    }

}
