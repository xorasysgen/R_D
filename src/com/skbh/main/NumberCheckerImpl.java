package com.skbh.main;

public class NumberCheckerImpl  implements  NumberChecker{

	@Override
	public Boolean checkNumber(Integer number) throws NumberNotSupported {
		
		if(number>0)
		return true;
		else
		throw new NumberNotSupported("Number not supported",new Throwable("Number must be positive i,e 1 to n numbers"));
			
	}

}
