package Practice;

public class MoveZerotoEnd {

	public static void main(String[] args) {
		int A[] = { 0, 1, 0, 12, 3 };
		int n = 5;
		check(A, n);
	}

	private static void check(int[] A, int n) {
//		int count = 0, j = 0;
//		for (int i = 0; i < n; i++) {
//			if (A[i] != 0) {
//				swap(A, j, i);
//				j++;
//			}
//		}                              
		                         

		int left = 0, right = 0;
		while (right < n) {
			if (A[right] == 0) {
				right++;
			} else {
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;
				left++;
				right++;
			}
		}

		for (int i = 0; i < n; i++)
			System.out.print(A[i] + " ");

	}

	private static void swap(int[] A, int j, int i) {
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;

	}

}
