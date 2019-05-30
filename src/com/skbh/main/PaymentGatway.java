package com.skbh.main;

public interface PaymentGatway {
	
	public abstract int acceptPayment(String paymentName) throws PaymentMethodNotSuported;
			

}
