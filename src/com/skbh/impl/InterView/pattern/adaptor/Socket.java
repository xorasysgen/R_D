package com.skbh.impl.InterView.pattern.adaptor;

public class Socket {
	
	private final int volt=440;
	
	public Volt getVoltPower() {
		return new Volt(volt);
	}

}
