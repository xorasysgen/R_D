package code.java8.string;

public class StringTest {

	public static void main(String[] args) {
		String int1 =new String("sushil").intern();
		String int2="sushil";
		System.out.println(int1==int2);
		
		 String ss1=new String("sushil");
		 String ss2=new String("sushil");
		 System.out.print(ss1==ss2);
		 System.out.println(ss1.equals(ss2));
		
		
		 StringBuilder sb1=new StringBuilder("sushil");
		 StringBuilder sb2=new StringBuilder("sushil");
		 System.out.print(sb1==sb2);
		 System.out.println(sb1.equals(sb2));
		 
		 
		 StringBuffer s1=new StringBuffer("sushil");
		 StringBuffer s2=new StringBuffer("sushil");
		 System.out.print(s1==s2);
		 System.out.println(s1.equals(s2));

	}

}
