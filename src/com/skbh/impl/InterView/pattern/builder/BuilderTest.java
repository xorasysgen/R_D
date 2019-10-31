package com.skbh.impl.InterView.pattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		BootServer server=BootServer.builder()
				.addServerName("Undertow")
				.addServerPort(5050)
				.setListenerType("HTTP")
				.setServerType("web")
				.build();
		System.out.println(server);

	}

}
