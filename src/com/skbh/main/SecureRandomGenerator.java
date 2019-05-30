package com.skbh.main;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomGenerator {

	public static void main(String[] args) {
		char[] choices = ("abcdefghijklmnopqrstuvwxyz" +"ABCDEFGHIJKLMNOPQRSTUVWXYZ" +"0123456789" +"@#$%^&").toCharArray();
		Integer generatorlimit=choices.length;
		Integer lengthOfKey=32;
	    try {
		SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG");//secure random number generator SHA1PRNG algorithm
		
		byte[] randomBytes = new byte[1024];// Get 128 random bytes
		secureRandomGenerator.nextBytes(randomBytes);
		int seedByteCount = 5;// Create seed
		byte[] seed = secureRandomGenerator.generateSeed(seedByteCount);
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(seed);
		StringBuilder salt = new StringBuilder(generatorlimit);
		
		
		for (int i = 0; i<lengthOfKey; ++i) {
			salt.append(choices[secureRandom.nextInt(choices.length)]);
		}
		System.out.println(salt.toString());
	
	    } catch (NoSuchAlgorithmException e) {
	    	
	    }
		
	}

}
