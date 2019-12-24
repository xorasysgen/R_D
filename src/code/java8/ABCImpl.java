package code.java8;

public class ABCImpl  implements C{

	public void access() {
		C.super.show();
	}
	
	public static void main(String[] args) {
		new ABCImpl().access();
	}

}
