package com.skbh.main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	static class Innerclass{
		@SuppressWarnings("unused")
		private static int value=2588;
	}
	
	class Inner{
			 class MostInner{
				private int a=10;
				
				
				public int getA() {
					return a;
				}

				public void setA(int a) {
					this.a = a;
				}
				
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> q=new  PriorityQueue<Integer>();
		q.add(1);
		q.poll();
		q.offer(2);
		q.offer(3);
		q.offer(4);
		System.out.println(q.size());
		System.out.println(q.offer(99));
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(new QueueExample().new Inner().new MostInner().getA());
	}

}
