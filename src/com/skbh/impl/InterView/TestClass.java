package com.skbh.impl.InterView;

class Item{
	
	private int item_No;

	public int getItem_No() {
		return item_No;
	}

	public void setItem_No(int item_No) {
		this.item_No = item_No;
	}


	
	
}


public class TestClass  implements Cloneable{

	private int i = 0;
	private Item item=new Item();
	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		TestClass testClasstemp=new TestClass();
		testClasstemp.setI(this.getI());
		testClasstemp.getItem().setItem_No(this.getItem().getItem_No());
		return testClasstemp;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		TestClass testClass=new TestClass();
		testClass.getItem().setItem_No(2000);
		TestClass dup=((TestClass) testClass.clone());
		testClass.setI(200);
		System.out.println("Original ="+ testClass.getItem().getItem_No());
		dup.getItem().setItem_No(9000);
		System.out.println("dup " + dup.getItem().getItem_No());
		System.out.println("Original =" + testClass.getItem().getItem_No());
		System.out.println(testClass.getItem()==dup.getItem());

	}

}
