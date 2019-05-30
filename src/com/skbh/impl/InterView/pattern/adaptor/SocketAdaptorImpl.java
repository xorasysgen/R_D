package com.skbh.impl.InterView.pattern.adaptor;

public class SocketAdaptorImpl implements SocketAdaptor {
	
	private Socket socket=new Socket(); 
	
	@Override
	public Volt get440Volts() {
		return socket.getVoltPower();
	}

	@Override
	public Volt get220Volts() {
		Volt v=socket.getVoltPower();
		return convertVolt(v,2);
	}

	@Override
	public Volt get110Volts() {
		Volt v=socket.getVoltPower();
		return convertVolt(v,4);
	}
	
	
	private Volt convertVolt(Volt v,int voltOutput) {
		return new Volt(v.getVolt()/voltOutput);
	}

}
