package aggregation;


//lombok => 

public class Author {
	String name;
	private String address;
	private int age;
	
	
	public Author(String name, String address, int age) {
//		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	
	
}
