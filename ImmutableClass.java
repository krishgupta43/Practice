package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class Student {
	
	private final int id;
	private final String name;
	private final List<String> email;
	
	public Student(int id, String name, List<String> email) {
		this.id = id;
		this.name = name;
		List<String>li=new ArrayList<>();
		for(String emails:email) {
			li.add(emails);
		}
		this.email=li;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getEmail() {
		List<String>li=new ArrayList<>();
		for(String emails:email) {
			li.add(emails);
		}
		return li;
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}

class ImmutableClass {
	
	public static void main(String[] args) {
		List<String>li=Stream.of("krish@gmail.com","rahul@gmail.com").collect(Collectors.toList());
		Student s=new Student(1,"krishna",li);
		System.out.println(s);
		System.out.println();
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getEmail());
		li.add("ss@gmail.com");   //not added
		System.out.println(s);
		System.out.println(s.getEmail());
		
		
	}
}