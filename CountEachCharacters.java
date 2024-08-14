package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountEachCharacters {

	static final int SIZE = 26;

	static void printEachChar(String str) {

		int n = str.length();
		int[] freq = new int[SIZE];

		for (int i = 0; i < n; i++) {
			freq[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < n; i++) {
			if (freq[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i));
				System.out.print(freq[str.charAt(i) - 'a'] + " ");
				freq[str.charAt(i) - 'a'] = 0;
			}
		}

	}

	// using java 8 fetures
	static void printEachCharUingJava8(String str) {
		System.out.println();
		System.out.println("-----------------------");
		java.util.Map<Character, Long> li = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(li);
		java.util.Map<Object, Long> li_1 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(li_1);
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		printEachChar(str);
		printEachCharUingJava8(str);
	}

}
