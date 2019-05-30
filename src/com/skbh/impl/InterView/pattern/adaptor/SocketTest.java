package com.skbh.impl.InterView.pattern.adaptor;

public class SocketTest {

	public static void main(String[] args) {
		Volt v1=new SocketAdaptorImpl().get440Volts();
		Volt v2=new SocketAdaptorImpl().get220Volts();
		Volt v3=new SocketAdaptorImpl().get110Volts();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
