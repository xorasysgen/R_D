package com.skbh.impl.InterView.pattern.adaptor;

/**
 * @author Sushil K Bhaskar
 *
 */
public class Volt {
	
	private int Volt;
	
	public Volt(int volt) {
		super();
		Volt = volt;
	}

	public int getVolt() {
		return Volt;
	}

	public void setVolt(int volt) {
		Volt = volt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Volt [Volt=");
		builder.append(Volt);
		builder.append("]");
		return builder.toString();
	}
	
	
}
