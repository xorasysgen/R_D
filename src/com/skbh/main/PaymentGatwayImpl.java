package com.skbh.main;

public class PaymentGatwayImpl implements PaymentGatway {

	@Override
	public int acceptPayment(String paymentName) throws PaymentMethodNotSuported {
		if(paymentName.equalsIgnoreCase("Credit Card") 
				|| paymentName.equalsIgnoreCase("Debit Card")
						|| paymentName.equalsIgnoreCase("Wallet"))
			return 0;
			else {
				Throwable cause=new Throwable("Cause due to Payment Issue");
				throw new PaymentMethodNotSuported("we get payment from Debit Card , credit card and wallet only",cause);
			}
	}

}
