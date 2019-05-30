package com.skbh.main;

public class SingleLoop {

	public void singleLoop() {
		int j = -1;
		for (int i = 1; i <= 100; i++) {
			if (i == 100) {
				j = 100;
				i = 0;
			}
			if (i <= 100 && j == -1) {
				System.out.print(i + " ");
			} else {
				System.out.print(j-- + " ");
				if (j == 1)
					return;
			}
		}
	}

	public static void print(int limit) {
		for (int row = 1,temp=0; row <= limit; row++,temp=0) {
			
			int distance=limit-1;
			for (int colume = 1; colume <= row; colume++) {
				if(colume==1)
					System.out.print(row  + " ");
				else {
					if(temp==0)
						temp=distance+row;
					else
						temp=distance+temp;
					
					distance--;
					System.out.print(temp + " ");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		print(6);
	}

}
