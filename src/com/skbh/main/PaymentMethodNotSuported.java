package com.skbh.main;

public class PaymentMethodNotSuported  extends Exception{
	
	private static final long serialVersionUID = 1367302027630214175L;

	public PaymentMethodNotSuported(String errorMessage) {
		super(errorMessage);		
	}
	
	public PaymentMethodNotSuported(String errorMessage,Throwable cause) {
		super(errorMessage,cause);		
	}
	

}
