package com.skbh.main;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {
	private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.pop();
		System.out.println("stack.peek()" + stack.peek());
		System.out.println("before " + stack.size());
		stack.add(3);
		stack.add(4);
		stack.add(5);
		System.out.println("after " + stack.size());
		System.out.println(stack.search(4));
		for (Integer integer : stack) {
			System.out.println(integer);
		}
			
		
		 Runtime runtime = Runtime.getRuntime();
         // Run the garbage collector
         runtime.gc();
         // Calculate the used memory
         long memory = runtime.totalMemory() - runtime.freeMemory();
         System.out.println("Used memory is bytes: " + memory);
        
         System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
         
		int [][][]a={
				{{1,2,3,4},{1,2,3,4},{1,2,3,4}},
				{{11,22,33,44},	{11,22,33,44},{11,22,33,44}},
				{{111,222,333,444},	{111,222,333,444},{111,222,333,444}}
				};
		System.out.println(Arrays.deepToString(a));
		
	
		
		System.out.println(" length#" + a.length);
		 memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
	}
		

}
