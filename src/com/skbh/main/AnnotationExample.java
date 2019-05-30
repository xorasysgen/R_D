package com.skbh.main;

public class AnnotationExample {
	
	@Copyright(copyWriteAddress = "D-50,New Friends Colony, New Delhi, India", copyWriteName = "Sushil Kumar bhaskar")
	private String copywrite;

	public String getCopywrite() {
		return copywrite;
	}

	public void setCopywrite(String copywrite) {
		this.copywrite = copywrite;
	}

	public static void main(String[] args) {
		AnnotationExample annotationExample=new AnnotationExample();
		System.out.println("copywrite : " + annotationExample.getCopywrite());
	}

}
