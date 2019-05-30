package com.skbh.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOVsNIO {

	public static void main(String[] args) {
		Path dir=Paths.get("D:\\temp\\dir");
		Path file=Paths.get("D:\\temp\\dir\\newFile.txt");
		
		try {
			Files.createDirectories(dir);
			Files.deleteIfExists(file);
			Files.createFile(file);
			FileWriter fl=new FileWriter(new File("D:\\temp\\dir\\newFile.txt"));
			PrintWriter pe=new PrintWriter(fl);
			
			pe.println("Hello World");
			pe.println("Hello World");
			pe.println("Hello World");
			
			pe.close();fl.close();
		} catch (IOException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		
		Path source=Paths.get("D:\\temp\\dir\\newFile.txt");
		Path destination=Paths.get("D:\\temp\\dir\\asd.txt");
		try {
			Files.copy(source, destination,StandardCopyOption.REPLACE_EXISTING);
			//Files.delete(source);
		} catch (IOException | NumberFormatException exceptionObject ) {
			exceptionObject.printStackTrace();
		}

	}

}
