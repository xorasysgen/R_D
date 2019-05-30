package com.skbh.main;

public class FactorialSeries {
private static int  result=1;
private static int  result1=1;

	private static int febonacci( int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return (febonacci(n-1)+febonacci(n-2)); 
	}
	
	private static int  fab(int range){
		int n=1;
		if(n<=range){
			n++;
			return fab(febonacci(n));
		}
		return -1;
	}
	
	private static int findFactorial(int number){
		if(number>1){
		result=result*(number--);
		findFactorial(number);
		}
		return result;
		
			
	}
	
	private static int findFactorialMethod(int number){
		if(number>1){
		result1=findFactorialMethod(number-1)*number;
		}
		return result1;
		
			
	}
	
	private static int findFactorialStack(int number){
		if(number>1){
		return findFactorialStack(number-1)*number;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Factorials : "  + FactorialSeries.findFactorial(0));
		System.out.println("Factorials : "  + FactorialSeries.findFactorialMethod(0));
		System.out.println("Factorials : "  + FactorialSeries.findFactorialStack(-5));
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(febonacci(i));
			
		}//System.out.println(fab(10));
	}

}
