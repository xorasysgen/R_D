package code.test;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class _RandomKeyManager {
	
	private static final Map<Integer, String> keyManager=init();
    
    private static final Map<Integer, String> init() {
        Map<Integer, String> keyManager = new LinkedHashMap<>();
        keyManager.put(0, "HA6ACPO8NKXJKU66");
        keyManager.put(1, "5F5JO1XMBYDWU5T6");
        keyManager.put(2, "BQBDQERCYF42HR7Y");
        keyManager.put(3, "QZU66N7BF6Q7PGU5");
        keyManager.put(4, "HA6ACPO8NKXJKU66");
        keyManager.put(5, "5F5JO1XMBYDWU5T6");
        keyManager.put(6, "BQBDQERCYF42HR7Y");
        keyManager.put(7, "QZU66N7BF6Q7PGU5");
        return Collections.unmodifiableMap(keyManager);
    }
	
	

		private static int getRandom(int generatorlimit){
		 
		SecureRandom secureRandomGenerator = null;
		SecureRandom secureRandom=null;
		try {
			secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG");
		
		int seedByteCount = generatorlimit;// Create seed
		byte[] seed = secureRandomGenerator.generateSeed(seedByteCount);
		secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(seed);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}//secure random number generator SHA1PRNG algorithm
		return secureRandom.nextInt(generatorlimit);
			
		}
		
		public static String getRandomAccessKey() {
			return keyManager.get(getRandom(7));
		}
		
		
		
		public static void main(String[] args) throws NoSuchAlgorithmException, InterruptedException {
				System.out.println(getRandomAccessKey());

		}
	
}
