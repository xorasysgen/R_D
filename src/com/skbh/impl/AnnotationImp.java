package com.skbh.impl;

public class AnnotationImp {

	@NotNullKey(copyWriteName = "sushil") 
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		AnnotationImp annotationImp=new AnnotationImp();
		System.out.println(annotationImp.getName());
	}
}
