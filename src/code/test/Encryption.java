package code.test;

import java.security.AlgorithmParameters;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Encryption {
    private static final String password = "test";
    private static String salt;
    //private static int pswdIterations = 65536  ;
    private static int pswdIterations = 1000  ;
    private static int keySize = 256;
    private static int saltlength = keySize / 8;
    private static byte[] ivBytes;
    
    
    public static void main(String[] args) throws Exception {
    	System.out.println("test");
    	testEncryption();
    }
    
	// Methods
    public static String encrypt(String plainText) throws Exception {   
        
        //get salt
        salt = generateSalt();      
        byte[] saltBytes = salt.getBytes("UTF-8");
         
        // Derive the key
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(), 
                saltBytes, 
                pswdIterations, 
                keySize
                );
 
        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");
 
        //encrypt the message
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        AlgorithmParameters params = cipher.getParameters();
        ivBytes = params.getParameterSpec(IvParameterSpec.class).getIV();
        byte[] encryptedTextBytes = cipher.doFinal(plainText.getBytes("UTF-8"));

        // Base64 for Android
        //String encodedText = Base64.encodeToString(encryptedTextBytes, Base64.DEFAULT);

	// Base64 for Java
        String encodedText = Base64.encodeBase64String(encryptedTextBytes);
        String encodedIV = Base64.encodeBase64String(ivBytes);
        String encodedSalt = Base64.encodeBase64String(saltBytes);
        String encodedPackage = encodedSalt + "]" + encodedIV + "]" + encodedText;
        return encodedPackage;
    }

    public static String decrypt(String encryptedText) throws Exception {
 
		String[] fields = encryptedText.split("]");
		byte[] saltBytes = Base64.decodeBase64(fields[0]);
		ivBytes = Base64.decodeBase64(fields[1]);
        byte[] encryptedTextBytes = Base64.decodeBase64(fields[2]);
 
        // Derive the key
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(), 
                saltBytes, 
                pswdIterations, 
                keySize
                );
 
        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");
 
        // Decrypt the message
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(ivBytes));
     
 
        byte[] decryptedTextBytes = null;
        try {
            decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
 
        return new String(decryptedTextBytes);
    }

    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[saltlength];
        random.nextBytes(bytes);
        return new String(bytes);
    }

    public static String testEncryption() throws Exception {
    	String encryptedText = encrypt("Hello");
    	System.out.println("Encrypting \"Hello\": " + encryptedText);
    	System.out.println("Decrypting text = " + decrypt(encryptedText));
    	return decrypt(encryptedText);
    }
}