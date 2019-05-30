package com.skbh.main;

interface Anonymous{
	
	void getAnonymousAccess();
	
}


class Cart{
	
	private int i;
	
	public Cart(int i) {
		super();
		this.i = i;
	}

	static class StaticNestedClass {

		static int x;
		void print() {
			System.out.println("static nested class" + x);
		}
		
		static {
			x=5;
		}
		
		
	}

	class NONStaticNestedClass {
		void print() {
			System.out.println("non static nested class");
		}
	}

}



class StaticClass {

	public static void main(String[] args) {
		
			
		
		Cart.StaticNestedClass s=new Cart.StaticNestedClass(); 
		Cart.NONStaticNestedClass ns=new Cart(8).new NONStaticNestedClass();
		s.print();
		ns.print();
		
		new Anonymous() {

			@Override
			public void getAnonymousAccess() {
				// TODO Auto-generated method stub
				
			}
			
		}.getAnonymousAccess();
		
	
	}

}
