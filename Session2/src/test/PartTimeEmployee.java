package test;

public class PartTimeEmployee extends Employee {
	
	//because this instance variable is only for this child(Part time)
	private int workingHour;
	
	public PartTimeEmployee(String name, int paymentPerhour, int workingHours) {
		//???? super 
		// super is a keyword like "this" to 
		// call the constructor of the parent 
		//this line needs to be the first line of the constructor

		super(name, paymentPerhour);
		this.workingHour = workingHours;
	}
	
	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerhour() * getWorkingHour();
	}
	
	
	//Alt + Shift + S => windows

}
