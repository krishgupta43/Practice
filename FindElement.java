package Practice;

public class FindElement {
 public static void main(String[] args) {
	int A[]= {1,5,4,9,6,2};
	int n=6;
	check(A,n);
}

private static void check(int[] A, int n) {
	int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
	
	for(int i=0;i<n;i++) {
		if(A[i]>first) {
			second=first;
			first=A[i];
		}
	}
	if(second!=Integer.MIN_VALUE) {
		System.out.println(second);
	}
	else {
		System.out.println(-1);
	}
	
}
}
