package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSum {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7};
		Integer target = 7;

		List<List<Integer>> combination = findCombinationSum(arr, target);
		System.out.println(combination);

	}

	static List<List<Integer>> ans = new ArrayList<>();

	static List<List<Integer>> findCombinationSum(int[] arr, Integer target) {
		List<Integer> li=new ArrayList<>();
		helper(arr, target, 0, 0, li);
		return ans;
	}

	static void helper(int[] candidate, Integer target, Integer i, Integer curSum, List<Integer> temp) {

		if (curSum > target)
			return;

		if (i == candidate.length) {
			if (curSum == target) {
				ans.add(temp);
			}
			return;
		}

		curSum += candidate[i];
		temp.add(candidate[i]);
		helper(candidate, target, i, curSum, temp);
		curSum -= candidate[i];
		temp.remove(temp.size()-1);
        helper(candidate, target, i + 1, curSum, temp);

	}

}
