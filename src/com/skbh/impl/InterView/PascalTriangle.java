package com.skbh.impl.InterView;

public class PascalTriangle {

	public static long factorial(int n) {
		if (n > 1)
			return factorial(n - 1) * n;
		return 1;
	}

	public static int fibonacci(int n) {
		if (n > 1)
			return fibonacci(n - 1) + fibonacci(n - 2);
		return 1;
	}

	public static void pascalTriangle(int depth) {

		for (int row = 1; row <= depth; row++) {
			int data = 1;
			for (int col = 1; col <= row; col++) {
				System.out.print(data);
				data = (data * (row - col)) / col;
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		pascalTriangle(6);
		System.out.println(factorial(5));
		for (int i = 0; i < 318888; i++) {
			System.out.print(fibonacci(i) + " ");
			if(i==30){
				System.exit(0);
			}
		}

	}

}
