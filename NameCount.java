package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameCount {
	
	public static void main(String[] args) {
		String str="krishna rahul deepak  kk deepak kk";
		String[] arr=str.split(" ");
		List<String>names=Arrays.asList(arr);
//		List<String>names=Arrays.asList("krishna","rahul","deepak","kk","deepak","kk");
		
		//using as in string as in input
		System.out.println(Arrays.stream(str.split(" " )).collect(Collectors.groupingBy(x->x,Collectors.counting())));
		
		//sort using Stream api
//		names.stream().sorted().forEach(System.out::println);
		
		//Counting each word using stream api;
		java.util.Map<String, Long> nameCount=names.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));	
		System.out.println(nameCount);
		
		String str_1="rahaaaul";
		Long count=str_1.chars().filter(e->(char)e=='a').count();
		
		System.out.println(count);
		System.out.println(Arrays.stream(str_1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(str_1.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting())));
		
	}
	

}
