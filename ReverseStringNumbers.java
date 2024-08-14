package Practice;

public class ReverseStringNumbers {

	public static void main(String[] args) {
		String str = "12  3";
		check(str);
	}


	private static void check(String str) {
		StringBuffer sb = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
		
		
	}

}
