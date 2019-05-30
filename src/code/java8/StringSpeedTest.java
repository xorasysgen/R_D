package code.java8;

public class StringSpeedTest {
	public static String concat4(String s1, String s2, String s3, String s4, String s5, String s6) {
		return s1 + s2 + s3 + s4 + s5 + s6;
	}
	
	public static String concat5(String s1, String s2, String s3, String s4, String s5, String s6) {
		return new StringBuilder(s1.length() + s2.length() + s3.length() + s4.length() + s5.length() + s6.length())
				.append(s1).append(s2).append(s3).append(s4).append(s5).append(s6).toString();
	}
	
	
	public static void main(String[] args) {
		Long l1=System.nanoTime();
		System.out.println(StringSpeedTest.concat5("s1", "s2", "s3", "s4", "s5", "s6"));
	 	Long l2=System.nanoTime();
		System.out.println(l2-l1);
		l1=System.nanoTime();
	 	StringSpeedTest.concat4("s1", "s2", "s3", "s4", "s5", "s6");
		l2=System.nanoTime();
		System.out.println(l2-l1);
	}

}
