package Practice;

import java.util.Comparator;

public class CompratorName implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
 
}
