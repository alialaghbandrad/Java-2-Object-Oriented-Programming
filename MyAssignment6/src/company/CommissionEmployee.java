package company;

public class CommissionEmployee extends Employee {
	protected double sales;
	protected double commission;

	public CommissionEmployee(String name, String ssn, double sales, double commission) {
		super(name, ssn);
		setCommission(commission);
		setSales(sales);
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		
		if (sales >= 0.0) {
			this.sales = sales;
		} else {
			throw new IllegalArgumentException("sales must be positive");
		}
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		
		if (commission >= 0.0) {
			this.commission = commission;
		} else {
			throw new IllegalArgumentException("commission must be positive");
		}
	}

	@Override
	public double salary() {
		return getCommission() * getSales();
	}

	@Override
	public String toString() {
		return super.toString() + "CommissionEmployee [sales=" + sales + ", commission=" + commission + "]";
	}
}
