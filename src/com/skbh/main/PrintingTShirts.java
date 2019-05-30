package com.skbh.main;

public class PrintingTShirts implements ExceptionTest {

	@Override
	public int getPrintedTShirt(String color) throws TShirtNotSupported {
		if(color==null)
			throw new TShirtNotSupported("blank T can be printed");
		
		
		if(color.equals("RED")){
			throw new TShirtNotSupported("T Shirt color [" + color + "] does not support");
		}
		System.out.println(color + " is being printed!");
		return 0;
	}

}
