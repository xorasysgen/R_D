package com.skbh.impl.inheritance;

public class FirstSecond  implements First,Second{
	
	public static void main(String[] args) {
		Second s=new FirstSecond();
		s.test();
	}

	@Override
	public void test() {
		First.super.test();
	}
}
