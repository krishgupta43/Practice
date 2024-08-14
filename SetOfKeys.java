package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//
//Q. Print set of Keys having same value in hashmap
//Example input:
//Map<Integer, String> map = new HashMap<>();
//map.put(1, "x");
//map.put(2, "y");
//map.put(3, "x");
//map.put(4, "z");
//Output:
//{x=[1, 3], y=[2], z=[4]}
public class SetOfKeys {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "x");
		map.put(2, "y");
		map.put(3, "x");
		map.put(4, "z");

		Map<String, Set<Integer>> result = map.entrySet().stream().collect(
				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toSet())));

		System.out.println(result);
	}
}
