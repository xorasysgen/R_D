package com.skbh.impl.inheritance;

class SuperClass {
	
	private Integer value;
	
	SuperClass(Integer value){
		this.value=value;
	}

	@Override
	public String toString() {
		return "SuperClass [value=" + value + "]";
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}


class ThisClass extends SuperClass{
	
	private Integer value;

	ThisClass(Integer val,Integer value) {
		super(value);
		this.value=val;
	}

	@Override
	public String toString() {
		return "ThisClass [value=" + value + "]";
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}

public class ThisSuper {

	public static void main(String[] args) {
		SuperClass s=new ThisClass(10,20);
		System.out.println(s.getValue());

	}

}
