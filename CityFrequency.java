package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityFrequency {
	public static void main(String[] args) {
		String[] str = { "mumbai", "pune", "mumbai", "pune", "pune" };
		
		//using java 8
		List<String> li = Arrays.asList(str);
        Map<String, Long> mp = li.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(mp);

		long min = Integer.MIN_VALUE;
		String str_1 = "";
		for (Map.Entry<String, Long> li_2 : mp.entrySet()) {
        if (li_2.getValue() > min) {
				min = li_2.getValue();
				str_1 = li_2.getKey();
			}

		}
		System.out.println(str_1);
	}
}
