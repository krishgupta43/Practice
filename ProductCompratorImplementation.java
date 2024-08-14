package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCompratorImplementation {
	public static void main(String[] args) {
		
		List<ProductComprator> li = new ArrayList<ProductComprator>();
		li.add(new ProductComprator(1, "rahul", 349.3f));
		li.add(new ProductComprator(5, "kk", 343.3f));
		li.add(new ProductComprator(2, "him", 212.0f));
		li.add(new ProductComprator(7, "aman", 145.5f));
		
//		Reverse in Desending order
		Collections.sort(li,(p1,p2)->{ 
			return p2.id-p1.id;
			//return p1.name.compareTo(p2.name);
		});
		
//		List<ProductComprator>res=li.stream().sorted((p1,p2)->p1.getId()-p2.getId()).collect(Collectors.toList());
//		System.out.println(res); 
		System.out.println(li);
		
		li.stream().filter(x->x.name.startsWith("h")).forEach(x->System.out.println(x.id+ " "+x.name+" "+x.price));

		
//		li.stream().forEach(x->System.out.println(x.id+ " "+x.name+" "+x.price));
//		System.out.println("-------------------------");
//		for(ProductComprator p:li) {
//			System.out.println(p.id+ " "+p.name+" "+p.price);
//		}

	}
}
