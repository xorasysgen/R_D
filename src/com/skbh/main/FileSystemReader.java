package com.skbh.main;

import java.io.File;

public class FileSystemReader {

	public static void main(String[] args) {
		File dir=new File("c:\\");
		File[] children=dir.listFiles();
		if(children!=null){
		for (File file : children) {
		System.out.println("Directory name : " + file.getName().toUpperCase());	
		}
		}

	}

}
