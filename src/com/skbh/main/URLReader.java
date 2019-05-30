package com.skbh.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class URLReader {
     static Integer count=new Integer(1) ;
	public static void main(String[] args) {
		 
			  ExecutorService executorService=Executors.newFixedThreadPool(10);
		  executorService.execute(new Runnable() {
			@Override
			public void run() {
				URL oracle = null;
				
					try {
						oracle = new URL("https://www.google.co.in/");
					} catch (MalformedURLException exceptionObject) {
						// TODO Auto-generated catch block
						exceptionObject.printStackTrace();
					}
				        BufferedReader in = null;
						try {
							in = new BufferedReader(
							new InputStreamReader(oracle.openStream()));
							System.out.println("facebook page opens counter : "  + count++);
						} catch (IOException exceptionObject) {
							// TODO Auto-generated catch block
							exceptionObject.printStackTrace();
						}
				        String inputLine;
				        try {
							while ((inputLine = in.readLine()) != null);
							   // System.out.println(inputLine);
						} catch (IOException exceptionObject) {
							// TODO Auto-generated catch block
							exceptionObject.printStackTrace();
						}
				        try {
							in.close();
						} catch (IOException exceptionObject) {
							// TODO Auto-generated catch block
							exceptionObject.printStackTrace();
						}

				}
				
			
		});
		  
		  
		  executorService.shutdown();
	}
	}

