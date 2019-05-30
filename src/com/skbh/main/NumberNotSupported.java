package com.skbh.main;

public class NumberNotSupported extends Exception{
	private static final long serialVersionUID = 1L;
	
	public NumberNotSupported(String exceptionMessage){
		super(exceptionMessage);
		
	}
	
	public NumberNotSupported(Throwable exceptionCause){
		super(exceptionCause);
	}
	
	public NumberNotSupported(String exceptionMessage,Throwable exceptionCause){
		super(exceptionMessage,exceptionCause);
	}
	

}
