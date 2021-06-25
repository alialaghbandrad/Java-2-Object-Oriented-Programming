package company;

public abstract class Employee {
	protected String name;
	protected String ssn;
	
	
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	
	public abstract double salary();
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + "]";
	}
	
}
