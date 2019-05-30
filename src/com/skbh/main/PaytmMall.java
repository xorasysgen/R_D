package com.skbh.main;

public class PaytmMall {

	private static void acceptPayment() throws PaymentMethodNotSuported {
		PaymentGatwayImpl paymentGatwayImpl=new PaymentGatwayImpl();
		
		int status = 0;
		try {
			status = paymentGatwayImpl.acceptPayment("swallet");
		} catch (PaymentMethodNotSuported exceptionObject) {
			exceptionObject.printStackTrace();
			throw exceptionObject;
		}
	}
	
	
	public static void main(String[] args) {
		try {
			PaytmMall.acceptPayment();
		} catch (PaymentMethodNotSuported exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}

}
