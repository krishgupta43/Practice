package Practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime_1 {
	
	public static void main(String[] args) {
		List<Integer>primes= findPrime(2,100);
		System.out.println(primes);
	}

	private static List<Integer> findPrime(int s, int e) {
		return IntStream.rangeClosed(s, e).filter(Prime_1::IsPrime).boxed().collect(Collectors.toList());
	}
	
	private static boolean IsPrime(int number) {
		return IntStream.range(2, number).noneMatch(i->number%i==0);
	}

}
