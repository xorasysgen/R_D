package com.skbh.impl.InterView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path source=Paths.get("d:\\Testjava\\source\\test.txt");
		Path destination=Paths.get("d:\\Testjava\\destination\\testCopy.txt");
		//Path path = Paths.get("d:\\Testjava");
		//Path paths=Files.createDirectory(path);
		//Files.copy(source, destination);
		
		Path todelete=Paths.get("d:\\Testjava\\source\\testCopy1.txt");
		System.out.println("file Moved!");
		Files.delete(todelete);
		
	}

}
