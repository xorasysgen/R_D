package com.skbh.impl.InterView.List;

class StackThresholdReached extends RuntimeException {
	private static final long serialVersionUID = -1559889066007634478L;

	StackThresholdReached(String message) {
		super(message);
	}

	StackThresholdReached(String message, Throwable cause) {
		super(message, cause);
	}
}

class DataTypeNotsupported extends RuntimeException {
	private static final long serialVersionUID = -1559889066007634478L;

	DataTypeNotsupported(String message) {
		super(message);
	}
}

public class Stack<T> {

	private T[] array;
	private Integer top;
	private Integer capacity;
	private Integer defaultCapacity = new Integer(5);
	private Integer availableCapacity;

	@SuppressWarnings("unchecked")
	Stack(T type) {
		this.top = -1;
		this.capacity = defaultCapacity;
		if (type instanceof Integer) {
			this.array = (T[]) new Integer[capacity];
		} else if (type instanceof String) {
			this.array = (T[]) new String[capacity];
		} else if (type instanceof Long) {
			this.array = (T[]) new Long[capacity];
		} else if (type instanceof Double) {
			this.array = (T[]) new Double[capacity];
		} else if (type instanceof Float) {
			this.array = (T[]) new Float[capacity];
		} else if (type instanceof Short) {
			this.array = (T[]) new Short[capacity];
		} else if (type instanceof StringBuilder) {
			this.array = (T[]) new StringBuilder[capacity];
		} else if (type instanceof StringBuffer) {
			this.array = (T[]) new StringBuffer[capacity];
		}

		else
			throw new DataTypeNotsupported(type + " DataType is not supported, you can try with Integer,Long,Double,Float,Short, String, StringBuilder,StringBuffer");

	}
	
	@SuppressWarnings("unchecked")
	Stack(Integer capacity, T type) {
		this.top = -1;
		this.capacity = capacity;
		if (type instanceof Integer) {
			this.array = (T[]) new Integer[capacity];
		} else if (type instanceof String) {
			this.array = (T[]) new String[capacity];
		} else if (type instanceof Long) {
			this.array = (T[]) new Long[capacity];
		} else if (type instanceof Double) {
			this.array = (T[]) new Double[capacity];
		} else if (type instanceof Float) {
			this.array = (T[]) new Float[capacity];
		} else if (type instanceof Short) {
			this.array = (T[]) new Short[capacity];
		} else if (type instanceof StringBuilder) {
			this.array = (T[]) new StringBuilder[capacity];
		} else if (type instanceof StringBuffer) {
			this.array = (T[]) new StringBuffer[capacity];
		}

		else
			throw new DataTypeNotsupported(type + " DataType is not supported, can try with Integer or String");

	}

	public boolean push(T item) {
		if (capacity > 0) {
			array[++top] = item;
			availableCapacity = --capacity;
			return true;
		} else
			throw new StackThresholdReached("Stack Threshold Reached,stack out of memory",
					new Throwable("Please overide default Stack, Default stack capacity is " + defaultCapacity));
	}

	public T pop() {
		availableCapacity = capacity++;
		return array[top--];
	}

	public Integer getAvailableCapacity() {
		return availableCapacity;
	}

	public static void main(String[] args) {
		{
			Stack<Integer> stack = new Stack<Integer>(new Integer(0));
			System.out.println(stack.push(5));
			System.out.println(stack.push(25));
			System.out.println(stack.push(3));
			System.out.println(stack.push(2));
			System.out.println(stack.push(1));
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.push(300));
			System.out.println(stack.push(200));
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		}

		{
			Stack<String> stack1 = new Stack<String>(new String());
			stack1.push("Sushil");
			stack1.push("Kumar");
			stack1.push("Bhaskar");
			stack1.push("software");
			System.out.println(stack1.pop());
		}

		{
			Stack<Long> stack1 = new Stack<Long>(new Long(0));
			stack1.push(new Long(10000));
			stack1.push(new Long(20000));
			stack1.push(new Long(30000));
			stack1.push(new Long(40000));
			System.out.println(stack1.pop());
			System.out.println(stack1.getAvailableCapacity());
			System.out.println(stack1.pop());
			System.out.println(stack1.getAvailableCapacity());
			System.out.println(stack1.pop());
			System.out.println(stack1.getAvailableCapacity());
			System.out.println(stack1.pop());
			System.out.println(stack1.getAvailableCapacity());
		}
	}

}
