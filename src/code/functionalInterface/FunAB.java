package code.functionalInterface;

public class FunAB {

	public static void main(String[] args) {
		FunA a=() -> System.out.println("A");
		FunB b=() -> System.out.println("B");
		FunA aa=new FunA() {

			@Override
			public void method() {
				System.out.println("AA");
			}
			
		};
		aa.method();
		a.method();
		b.method();
		

	}

}
