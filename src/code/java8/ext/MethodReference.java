package code.java8.ext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class A{
	
	private Integer x;
	private Integer y;
	private String axisName;
	
	public A(Integer x, Integer y, String axisName) {
		this.x = x;
		this.y = y;
		this.axisName = axisName;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", axisName=" + axisName + "]";
	}
	
	
	
}	
	
	
class B{
		
		private Integer x;
		private Integer y;
		
		
		public B(Integer x, Integer y) {
			this.x = x;
			this.y = y;
		}


		@Override
		public String toString() {
			return "B [x=" + x + ", y=" + y + "]";
		}
		
	
	
	
}



public class MethodReference {
	
	public static void print(String s) {
		System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("sushil","kumar","bhaskar");
		list.forEach(MethodReference::print);
		list.forEach(System.out::print);
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("RUN");
				
			}
			
		});
		new Thread(()->System.out.println("RUN")).start();
		
	}

}
