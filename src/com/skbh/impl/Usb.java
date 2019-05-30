package com.skbh.impl;

public class Usb {
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usb [version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}

	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}
