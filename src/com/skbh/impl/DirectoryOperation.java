package com.skbh.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class DirectoryOperation {

	public static void main(String[] args) {
		File file=new File("D:\\temp\\mydir");
		file.mkdirs();
			File myFile = new File(file, "myFile.txt");
			try {
				myFile.createNewFile();
				PrintWriter pr=new PrintWriter(myFile);
				pr.println("Bhaskar");
				pr.println("Sushil");
				pr.println("Kumar");
				pr.println("Bhaskar");
				pr.flush();
				pr.close();
			} catch (IOException exceptionObject) {
				exceptionObject.printStackTrace();
			}
			try {
				BufferedReader br=new BufferedReader(new FileReader(new File("D:\\temp\\mydir\\myFile.txt")));
				System.out.println(br.lines().collect(Collectors.toList()));
				br.close();
			} catch (IOException exceptionObject) {
				exceptionObject.printStackTrace();
			}		
			
			Path path=Paths.get("myFile2.txt");
			try {
				Files.createFile(path);
			} catch (IOException exceptionObject) {
				// TODO Auto-generated catch block
				exceptionObject.printStackTrace();
			}
		
	}

}
