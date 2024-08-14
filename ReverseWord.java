package Practice;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "krishna Gupta";
		String arr[] = str.split("\\s");
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("----------------");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString());
	}

}
