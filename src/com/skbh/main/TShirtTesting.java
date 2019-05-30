package com.skbh.main;

public class TShirtTesting {

	public static void main(String[] args)  {
		PrintingTShirts printingTShirts=new PrintingTShirts();;
	
			try {
				System.out.println(printingTShirts.getPrintedTShirt("RED"));
			} catch (TShirtNotSupported exceptionObject) {
				// TODO Auto-generated catch block
				exceptionObject.printStackTrace();
			}
	
	}

}
