package code.java8;

interface root{
	
	public static int x=100;
	
	public static void going() {
		System.out.println("static root called");
	}
	default void go () {
		going();
		System.out.println("Root called");
	}
}

interface child extends root{
	public static void going() {
		root.going();
		System.out.println("static child called");
	}
	
	default void go () {
		root.super.go();// this is valid 
		root.going();
		System.out.println("child called");
	}
}

public class InterfaceTesting {

	public static void main(String[] args) {
		new child(){}.go();
		new root(){}.go();
		
		child.going();
		root.going();
		
		
	}

}
