package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWord {

	public static void main(String[] args) {
		String str = "my name is name my krishna";
		String[] token = str.split(" ");

		HashMap<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < token.length; i++) {
			if (mp.containsKey(token[i])) {
				int count = mp.get(token[i]);
				mp.put(token[i], count + 1);
			} else {
				mp.put(token[i], 1);
			}
		}
		System.out.println(mp);

		// using Java8
		Map<String, Long> map = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(map);

	}

}
