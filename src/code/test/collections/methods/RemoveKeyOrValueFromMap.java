package code.test.collections.methods;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RemoveKeyOrValueFromMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		{
			map.put(1, "One");
			map.put(2, "Two");
			map.put(3, "Thre");
			map.put(4, "Foure");
			map.put(5, "Five");
			map.put(6, "Six");
		}

		System.out.println(map);
		map.entrySet().removeIf(entry -> entry.getKey() == 5);//removing key 
		map.entrySet().stream().sorted(Map.Entry.comparingByKey());
		LinkedHashMap<Integer, String> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> null,
						LinkedHashMap<Integer, String>::new));// sorting map
		System.out.println(map1);
		map1.entrySet().removeIf(entry -> entry.getValue().equals("Six")); // removing value
		System.out.println(map1);

	}

}
