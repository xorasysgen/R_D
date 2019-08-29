package com.skbh.impl;

public class Palindrom {

	private Boolean palindromCheck(String string){
		for(int i=0, j=string.length()-1;i<=(string.length()-1)/2;i++,j--){
			System.out.println(i  + " "+ j);
			if(string.charAt(i)!=string.charAt(j)){
				return false;
			}
		}
		return true;
		
		}
	
	
	public static Boolean palindrom(String string){
	for(int i=0, j=string.length()-1;i<=(string.length()-1)/2;i++,j--){
		System.out.println(i  + " "+ j);
		if(string.charAt(i)!=string.charAt(j)){
			return false;
		}
	}
	return true;
	
	}
	public static void main(String[] args) {
		
		System.out.println(palindrom("RAMMAR"));
			

	}

}
