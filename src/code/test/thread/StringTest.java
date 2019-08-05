package code.test.thread;

public class StringTest {

	public static Integer lengthOfString(String s) {
		char[] ss=s.toCharArray();
		return ss.length;
	}
	
	@SuppressWarnings("unused")
	public static Integer lengthOfSTring(String s) {
		char[] ss=s.toCharArray();
		int length=0;
		try {
		for(int i=1;;i++) {
			length++;
			int t=ss[i];
		}
		}catch(ArrayIndexOutOfBoundsException ex) {
			return length;
		}
	
	}
	
	@SuppressWarnings("unused")
	public static Integer lengthOfSTRing(String s) {
		char[] ss=s.toCharArray();
		int length=0;
		for (char c : ss) 
			length++;
			return length;
		}
	
	public static int sumOfStringValue(String s) {
		char [] ss=s.toCharArray();
		int sum=0;
		for (int i = 0; i < ss.length; i++) {
			sum=sum+Character.getNumericValue(ss[i]);
		}
		return sum;
		
	} 
	
	public static String sumOfStringValues(String s) {
		char [] ss=s.toCharArray();
		String string="";
		string.length();
		for (int i = ss.length-1; i >=0; i--) {
			string=string.concat(String.valueOf(ss[i]));
			
		}
		
		return string;
		
	} 
	
	
	public static void main(String[] args) {
		/*System.out.println(sumOfStringValue("1232"));
		System.out.println(sumOfStringValues("23245675"));*/
		System.out.println("Length#" + lengthOfSTring("1234567890@123"));
		System.out.println("Length@" + lengthOfSTRing("1234567890@123"));
		System.out.println("Length@" + lengthOfString("1234567890@123"));
	}

}
