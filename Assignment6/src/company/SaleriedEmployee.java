package company;

public class SaleriedEmployee extends Employee {

	protected double basicSalary;

	public SaleriedEmployee(String name, String ssn, double basicSalary) {
		super(name, ssn);
		setBasicSalary(basicSalary);
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		// it can be your optional implemenetation
		// add your validation

		if (basicSalary >= 0.0) {
			this.basicSalary = basicSalary;
		}
		//exception handling . this is unchecked(runtime) exception
		else throw new IllegalArgumentException("salary must be greater than 0");
	}

	@Override
	public double salary() {
		return getBasicSalary();
	}

	@Override
	public String toString() {
		return super.toString() + "SaleriedEmployee [basicSalary=" + basicSalary + "]";
	}
	
	

}
