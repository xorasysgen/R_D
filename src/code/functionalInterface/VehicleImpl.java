package code.functionalInterface;

import java.util.function.Predicate;

public class VehicleImpl {
	
	public static void main(String[] args) {
		Vehicle vehicle = (x,y) -> x*y;
		Vehicle vehicle1 = (x,y) -> x-y;
		Vehicle vehicle2=(x,y)-> x/y;

		Predicate<String> p ;
		System.out.println(vehicle.getVehicleName(5,6));
		System.out.println(vehicle1.getVehicleName(5,6));
		System.out.println(vehicle2.getVehicleName(5,6));
		
		/*vehicle.defaultFunction();
		Vehicle.staticFunction();
		Vehicle.staticFunction(5);*/
		
		
	}


}
