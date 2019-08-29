package com.skbh.main;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class _Random {
	
	public static int getRandom1(int generatorlimit) throws NoSuchAlgorithmException{
 
	SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG");//secure random number generator SHA1PRNG algorithm
	int seedByteCount = generatorlimit;// Create seed
	byte[] seed = secureRandomGenerator.generateSeed(seedByteCount);
	SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
	secureRandom.setSeed(seed);
	return secureRandom.nextInt(generatorlimit);
		
	}
	
	
	public static String getRandom() throws NoSuchAlgorithmException {

		Random random = new Random();
		char[] choices = ("0123456789ABCDEFGHIJKLMNOPQRSTYVWXYZ").toCharArray();
		int len=5;
		StringBuilder salt = new StringBuilder(len);
		
		for (int i = 0; i<len; ++i) {
			salt.append(choices[random.nextInt(choices.length)]);
		}
		
		return salt.toString();
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
			System.out.println(getRandom());
			System.out.println(getRandom1(5));

	}

}
