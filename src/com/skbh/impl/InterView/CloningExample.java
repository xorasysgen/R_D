package com.skbh.impl.InterView;

import java.io.IOException;

public class CloningExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
		ObjectModels object=new  ObjectModels();
		object.setId(201);
		StringBuilder sbName=new StringBuilder("Serilization Objects");
		object.setName(sbName);
		StringBuilder sbver=new StringBuilder("V1.0.2.255");
		object.setVer(sbver);
		object.getVer();
		System.out.println("serilize Object : " + object.toString());
		ObjectModels obj=(ObjectModels) object.clone();
		System.out.println("cloned Object : " + obj.toString());
		System.out.println("Closed object");

	}

}
