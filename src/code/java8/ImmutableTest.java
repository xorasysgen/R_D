package code.java8;

import java.util.Date;

public class ImmutableTest {
	private static void hackMutable(Integer code, String value,Date timeStamp) {
		code=1000;
		value="sushil";
		timeStamp=new Date();
	} 
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		Immutable i=Immutable.getFactoryObject(10,"immutable" ,new Date());
		System.out.println(i);
		Thread.currentThread().sleep(2000);
		ImmutableTest.hackMutable(i.getCodSe(),i.getValue(),i.getTimeStamp());
		System.out.println(i);

	}

}
