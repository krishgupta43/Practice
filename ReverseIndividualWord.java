package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseIndividualWord {
	public static void main(String[] args) {
		String str = "Love Java";

		// using without java8
		String[] arr = str.split(" ");
		String res = "";
		for (String s : arr) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			res += sb.toString() + " ";
		}
		System.out.println(res);

		// Reverse individual word using java 8 features
		String result = Arrays.stream(str.split(" ")).map(x -> new StringBuffer(x).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(result);

		// Reverse without using inbuild function
		String str_2 = "Love Java";
		String strArr[] = str_2.split(" ");

		for (int i = 0; i <= strArr.length - 1; i++) {
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				System.out.print(strArr[i].charAt(j));

			}
			System.out.printf(" ");
		}

	}
}
