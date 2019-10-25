package com.skbh.impl.exception;

public class MethodException extends Throwable {
	
	private static final long serialVersionUID = 1L;

	MethodException(String msg, Throwable th) {
	super(msg,th);	
	}

}
