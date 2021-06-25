package examples;

class Address {
	private String streetName;
	private Integer buildingNumber;

	public Address(String streetName, Integer buildingNumber) {
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public Integer getBuildingNumber() {
		return buildingNumber;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", buildingNumber=" + buildingNumber + "]";
	}
	
	
}

public class Person {
	private String name;
	private int age;
	private Address address;


	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	

}
