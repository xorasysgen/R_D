package com.skbh.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (true) {
        	System.out.println("%nEnter your regex: ");
            Pattern pattern = 
            Pattern.compile(scanner.nextLine());
            System.out.println("Enter input string to search: ");
            Matcher matcher = 
            pattern.matcher(scanner.nextLine());

            boolean found = false;
            while (matcher.find()) {
               System.out.format("I found the text" + " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
            	System.out.format("No match found.%n");
            }
        }
    }


}
