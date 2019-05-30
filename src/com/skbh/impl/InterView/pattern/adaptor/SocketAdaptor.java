package com.skbh.impl.InterView.pattern.adaptor;

interface SocketAdaptor {
	
	public abstract Volt get440Volts();
	public abstract Volt get220Volts();
	public abstract Volt get110Volts();
}