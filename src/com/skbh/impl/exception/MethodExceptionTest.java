package com.skbh.impl.exception;


public class MethodExceptionTest {

	public String getDetail(String s) throws MethodException {
		if (s==null)
			throw new MethodException("Message can't be null", 
					new Throwable("Check Parameter for nullable", new Throwable("Null is not acceptable", new Throwable("Final Execption"))) 
			);
		return s;   
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(new MethodExceptionTest().getDetail("Param value"));
			System.out.println(new MethodExceptionTest().getDetail(null));
		} catch (MethodException e) {
			e.printStackTrace();
		}
		
		

	}

}
