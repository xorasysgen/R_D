package com.skbh.main;

public class StartPrinting {

	public static void startPrinting(){
	/*	for(int row=6;row>=1;row--){
			if(row%2==0){
				for(int col=row;col>=1;col--){
					System.out.print("*");
				}
				System.out.println();
			}
		}*/
		
		for(int row=1;row<=5;row++){
			
				for(int col=1;col<=row;col++){
					System.out.print("*");
				}
				System.out.println();
			
		}
	}
	
	
	public static void main(String[] args) {
		startPrinting();

	}

}
