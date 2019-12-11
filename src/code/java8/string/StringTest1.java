package code.java8.string;

public class StringTest1 {

	
	public void test(String o) {
		System.out.println("String o");
	}
	
	public void test(Object o) {
		System.out.println("Object o");
	}
	
	public static void main(String[] args) {
		new StringTest1().test(null);

	}

}
