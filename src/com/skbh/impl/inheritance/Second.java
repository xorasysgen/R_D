package com.skbh.impl.inheritance;

public interface Second {
	
	default void test() {
		System.out.println("Second Test");
	}
}
