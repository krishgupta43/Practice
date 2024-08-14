package Practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpMain {
	
	public static void main(String[] args) {
		
	List<Emp>emp = Stream.of(
			new Emp(5, "krishna", 112,"hr"),
		    new Emp(2, "aditya", 106,"account"),
		    new Emp(3, "kanik", 100,"hr"),
		    new Emp(4, "Mohan", 500,"hr")
		    ).collect(Collectors.toList());
		
		//Sort Employee using Lamda function
//		Collections.sort(emp,(e1,e2)->{
//			return e1.getId()-e2.getId();
//		});
//        System.out.println(emp);
//		
	
	System.out.println(emp);
        //Using CompratorName class
		Collections.sort(emp,new CompratorName());
		System.out.println(emp);
		
		System.out.println("-----Sorting-----");
		List<Emp>li=emp.stream().sorted((o1,o2)->o2.getNumber()-o1.getNumber()).collect(Collectors.toList());
		System.out.println(li);
		java.util.Map<String,Long>counting=emp.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.counting()));
	    System.out.println(counting);  
	    emp.stream().filter(x->x.getId()%2==0).map(x->x).forEach(System.out::println);
	}

}
