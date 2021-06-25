package finalExam;

public class Address{
	private String streetAddress;
	private int buildingNumber;
	
	
	public Address(String streetAddress, int buildingNumber) {
		this.streetAddress = streetAddress;
		this.buildingNumber = buildingNumber;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	
	public Address clone() {
		return new Address(this.streetAddress, this.buildingNumber);
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", buildingNumber=" + buildingNumber + "]";
	}

	
	
}
