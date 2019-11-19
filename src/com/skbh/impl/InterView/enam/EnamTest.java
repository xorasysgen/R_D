package com.skbh.impl.InterView.enam;


/*******************************************************************************
*implicitly extend the  java.lang.Enum class
*implicitly implement the   java.lang.Comparable 
*and  the  java.io.Serializable  interfaces.
*Java enum constructors must use a private or default package-level modifier. Enums can contain multiple constructors.
*Java enums implicitly extend the  java.lang.Enum class. Therefore, Java enums can't extend any class. But, enums can implement different interfaces.
*Java enums implicitly implement the   java.lang.Comparable and  the  java.io.Serializable  interfaces.
*We can't instantiate an enum using the new operator.
*We can also provide various values as enum-member variables with the enum constants.
*We can create abstract methods within an enum. In that case, all of the Enum constants will become abstract and will be required to implement declared abstract methods.
*https://dzone.com/articles/java-enums-how-to-make-much-more-useful
*********************************************************************************/


enum calulator {
	
	add {
		@Override
		public int exceuteTask(int a, int b) {
			return this.a + this.b + a + b;
		}
	},
	
	subtract {
		@Override
		public int exceuteTask(int a, int b) {
			return a-b;
		}
		
	},
	
	multiply{
		@Override
		public int exceuteTask(int a, int b) {
			return a*b;
		}
	},
	
	divide{
		@Override
		public int exceuteTask(int a, int b) {
			if(b==0)
			return 0;
			else
				return a/b;
		}
	};
	

	protected Integer a;
	protected Integer b;
	
	private calulator(){
		this.a=500;
		this.b=100;
		System.out.println("Constructor called");
	}
	

	public  abstract int  exceuteTask(int a, int b);
}	

public class EnamTest {
		public static void main(String[] args) {
			System.out.println(calulator.add.exceuteTask(10, 20));
			System.out.println(calulator.subtract.exceuteTask(10, 5));
	}

}
