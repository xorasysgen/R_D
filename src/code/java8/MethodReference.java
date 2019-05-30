package code.java8;

import java.util.function.Consumer;

import code.functionalInterface.Vehicle;

class Calulator{
	
	public Integer sum(int x,int y) {
		return x*y*y;
	}
	
	public Integer sub(int x,int y) {
		return x-y-2;
	}
	
}

public class MethodReference {

	
	public static void main(String[] args) {
		Calulator c=new Calulator();
		System.out.println(c.sum(5, 9));
		Vehicle v=c::sum;
		System.out.println(v.getVehicleName(5, 9));
		Consumer<String> cc = s -> System.out.println(s);
		
		cc.accept("589");
	}

}
