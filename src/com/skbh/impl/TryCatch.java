package com.skbh.impl;

public class TryCatch {

	public static Integer tryCatch(){
		try{
			Integer.parseInt("10");
			return 0;
		}catch(NumberFormatException ex){
			return 1;	
		}
		finally{
			System.out.println("Finally Executed");
			return 5;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(tryCatch());

	}

}
