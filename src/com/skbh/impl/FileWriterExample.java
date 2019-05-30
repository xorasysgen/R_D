package com.skbh.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileWriterExample {

	public static void main(String[] args) {
		
		File f=null;
		FileWriter fw=null;
		try {
			f=new File("d://temp/test.txt");
			fw=new FileWriter(f);
			fw.write("sushil\n");
			fw.write("kumar\n");
			fw.write("bhaskar\n");
			fw.flush();
			fw.close();
			fw=null;
			BufferedReader br =	new BufferedReader(new FileReader(f));
			String line=null;
		   /*while((line=br.readLine())!=null){
			System.out.println(line);
		   }*/
		   line =  br.lines().collect(Collectors.joining("\n"));
		   System.out.println(line);
		} catch (IOException exceptionObject) {
			exceptionObject.printStackTrace();
		}finally {
			try {
				if(fw!=null)
				{
					fw.flush();
					fw.close();
				}
			} catch (IOException exceptionObject) {
				exceptionObject.printStackTrace();
			}
		}
		

	}

}
