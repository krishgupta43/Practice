package Practice;

public class Simple {
	
//	static void Print2Largest(int A[],int n) {
//		if(n<2) {
//			return;
//		}
//		
//		Arrays.sort(A);
//		for(int i=n-2;i>=0;i--) {
//			if(A[i]!=A[i-1]) {
//				System.out.println(A[i]);
//				return;
//			}
//		}
//	}
	
	static void Print2Largest_1(int A[],int n) {
		int first,second;
		first=second=Integer.MIN_VALUE; 
		
		for(int i=0;i<n;i++) {
			first=Math.max(first,A[i]);
		}
		
		for(int i=0;i<n;i++) {
			if(A[i]!=first) {
				second=Math.max(second, A[i]);
			}
		}
		
		if(second==Integer.MIN_VALUE) {
			System.out.println("-1");
			
		}
		else {
			System.out.println(second);
		}
	}
	
	public static void main(String[] args) {
		int A[]= {20,1,7,2,6,40,23};
		int n=A.length;
		Print2Largest_1(A,n);
//		Print2Largest(A,n);
//	   List<Integer> li = new ArrayList<>(Arrays.asList(20,1,7,2,6,40,23));
//	   Set<Integer> s = new TreeSet<>(li);
//	   li.clear();
//	   
//	   for(int c:s) {
//		   li.add(c);
//	   }
//	   int n=li.size();
//	   System.out.println(li.get(n-2));
	   
	}

}
