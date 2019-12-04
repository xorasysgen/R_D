package com.skbh.impl.InterView.pattern.builder;


//Abstract Factory
interface CommunicationChannelFactory{
	
	public Communication createCommnicationChannel(); 
	
	
}

//concreate  factory
class SmsFactory implements CommunicationChannelFactory{

	private long mobileNo;
	private String message;
	
	public SmsFactory(long mobileNo, String message) {
		super();
		this.mobileNo = mobileNo;
		this.message = message;
	}


	@Override
	public Communication createCommnicationChannel() {
		return new Sms(mobileNo,message);
	}
	
}

//concreate  factory
class WhatsAppFactory implements CommunicationChannelFactory{

	private long mobileNo;
	private String message;
	
	public WhatsAppFactory(long mobileNo, String message) {
		super();
		this.mobileNo = mobileNo;
		this.message = message;
	}


	@Override
	public Communication createCommnicationChannel() {
		return new Sms(mobileNo,message);
	}
	
}
//Abstract product
abstract class Communication{
	abstract boolean sendMessage(long mobileNo,String message);
}

//concrete product
class Sms extends Communication{

	private long mobileNo;
	private String message;
	
	public Sms(long mobileNo, String message) {
		super();
		this.mobileNo = mobileNo;
		this.message = message;
	}

	@Override
	boolean sendMessage(long mobileNo, String message) {
		return false;
	}
	
}

public class AbstractCommunicationFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
