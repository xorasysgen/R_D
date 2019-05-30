package com.skbh.main;

public class NumberNotsupportedExceptionTest  extends Thread{
	
	public static void main(String[] args) {
		NumberCheckerImpl numberCheckerImpl=new NumberCheckerImpl();
	
			try {
				numberCheckerImpl.checkNumber(-25);
			} catch (NumberNotSupported exceptionObject) {
				exceptionObject.printStackTrace();
			}
		
	}
}
