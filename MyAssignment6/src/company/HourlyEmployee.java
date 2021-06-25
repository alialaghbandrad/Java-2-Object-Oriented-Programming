package company;

public class HourlyEmployee extends Employee {
	protected double wage;
	protected double hours;
	
	public HourlyEmployee(String name, String ssn, double wage, double hours) {
		super(name, ssn);
		setHours(hours);
		setWage(wage);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0.0) {
			this.wage = wage;
		}
		else {
			throw new IllegalArgumentException("wage should be positive");
		}
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours >= 0.0) {
			this.hours = hours;
		}
		else {
			throw new IllegalArgumentException("hours should be positive");
		}
	}

	@Override
	public double salary() {
		return getHours() * getWage();
	}

	@Override
	public String toString() {
		return super.toString() +  " HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}
}
