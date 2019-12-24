package code.functionalInterface;

@FunctionalInterface
public interface Vehicle {
	
	public static final int x=100;
	
	public abstract int getVehicleName(int x, int y);
	
	public static void staticFunction() {
		System.out.println("static function");
	}
	
	default public void defaultFunction() {
		System.out.println("default function");
	}
	
	public static void staticFunction(int x) {
		System.out.println(x*Vehicle.x);
	}	
}
