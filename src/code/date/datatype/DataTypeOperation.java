package code.date.datatype;

import java.io.Externalizable;

public class DataTypeOperation {
	void test(int x,long y) {
	System.out.println("int x,long y");	
	}

	void test(Integer x,Long y) {
		System.out.println("Integer x,Long y");	
		}
	
	void test(long y,int x) {
		System.out.println("long y,int x");	
		
	}
	
	public static void main(String[] args) {
		double d=128.00;
		byte b=(byte)d;
		System.out.println(b);
		new DataTypeOperation().test(5, 4589l);
		new DataTypeOperation().test(8l,6);
		new DataTypeOperation().test(new Integer(8),new Long(6));
		String s=new String("45");
		Integer d1=Integer.valueOf(s);
		int i=Integer.parseInt("3");
		System.out.println(d1);
		System.out.println(i);
		
		String doublev="5896589.25";
		System.out.println(Integer.MAX_VALUE);
		Double v=Double.valueOf(doublev);
		System.out.println(v);
		double v1=Double.parseDouble(doublev);
		System.out.println(v1);
	}

}
