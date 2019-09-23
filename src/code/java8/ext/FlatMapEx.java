package code.java8.ext;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Parcel {
	String name;
	List<String> items;

	public Parcel(String name, String... items) {
		this.name = name;
		this.items = Arrays.asList(items);
	}

	public List<String> getItems() {
		return items;
	}
}

public class FlatMapEx {

	public static void main(String[] args) {
		Parcel amazon = new Parcel("amazon", "Laptop", "Phone", "Tablet");
		Parcel ebay = new Parcel("ebay", "Mouse", "Keyboard", "touchPoint");
		Parcel flipkart = new Parcel("flipkart", "LCD", "Monitor", "Projector");
		List<Parcel> parcels = Arrays.asList(amazon, ebay, flipkart);

		System.out.println("-------- Without flatMap() ---------------------------");
		List<List<String>> mapReturn = parcels.stream().map(Parcel::getItems).collect(Collectors.toList());

		System.out.println("\t collect() returns: " + mapReturn);

		System.out.println("\n-------- With flatMap() ------------------------------");

		List<String> flatMapReturn = parcels.stream()
				.map(Parcel::getItems)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println("\t collect() returns: " + flatMapReturn);
	}

}
