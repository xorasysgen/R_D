package code.java8;


class D implements B,C {

	@Override
	public void show() {
		System.out.println("D show");
	}
	
}


public class DimondOfDeathSolved {

	public static void main(String[] args) {
		new D().show();

	}


}
