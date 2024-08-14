package Practice;

public class Emp {
	
	private int id;
	private String name;
	private int number;
	private String dept;
	
	public Emp(int id, String name, int number,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;  
		this.dept=dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	

}
