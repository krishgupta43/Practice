package Practice;
import java.util.Arrays;
import java.util.List;

public class CheckBothListEqual {

	public static void main(String[] args) {

		List<Integer> li_1 = Arrays.asList(1, 2, 3);
		List<Integer> li_2 = Arrays.asList(1, 2, 3);

		boolean res = check(li_1, li_2);
		System.out.println(res);

	}

	private static boolean check(List<?> li_1, List<?> li_2) {
		if (li_1.size() != li_2.size()) {
			return false;
		}

		for (int i = 0; i < li_1.size(); i++) {
			if (!li_1.get(i).equals(li_2.get(i))) {
				return false;
			}
		}
		return true;
	}

}
