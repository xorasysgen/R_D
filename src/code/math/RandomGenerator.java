package code.math;

import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomGenerator {
	
	private static final Integer finalVar=10000; 

	@SuppressWarnings("unused")
	private static String getRandomToken() {

		Random random = new Random();
		char[] choices = ("abcdefghijklmnopqrstuvwxyz" +"ABCDEFGHIJKLMNOPQRSTUVWXYZ" +"01234567890" +"$#_").toCharArray();
		int len=32;
		StringBuilder salt = new StringBuilder(len);
		
		for (int i = 0; i<len; ++i) {
			salt.append(choices[random.nextInt(choices.length)]);
		}
		
		return salt.toString();
	}

	public static String generateLIN(String firstDigit) {

		try {

			Thread.sleep(10);
		}
		catch (InterruptedException ex) {
			Logger.getLogger(RandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
		}

		SecureRandom secureRandom = new SecureRandom();

		secureRandom.setSeed(System.currentTimeMillis()+secureRandom.nextInt());
		long rand=secureRandom.nextInt(99999999-10000000);
		long randomNumber =  rand + 10000000;
		System.out.println(rand);
		System.out.println(randomNumber);

		String lin = firstDigit + "" + randomNumber + Verhoeff.generateVerhoeff(firstDigit + "" + randomNumber);

		return lin;
	}
	//for get emailVarificationCode
		public static String getEmailToken(){
			Random random = new Random();
			int randomNumber = random.nextInt();
			String str = Integer.toHexString(randomNumber);
			String emailVarificationCode = str.substring(0,5);
			
			return emailVarificationCode;
		}
		
		
		public static void main(String[] args) {
			System.out.println(RandomGenerator.generateLIN("1"));
			System.out.println("__________________");
			System.out.println(RandomGenerator.generateLIN("1"));
			
		}

		public Integer getS() {
			return finalVar;
		}
		
}
