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


		if (basicSalary >= 0.0) {
			this.basicSalary = basicSalary;
		}

		else throw new IllegalArgumentException("salary should be positive");
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
