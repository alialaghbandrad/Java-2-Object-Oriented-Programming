package test;

public abstract class Employee {
	//we have a system to calculate the salary of employee of a company
	private String name;
	private int paymentPerhour;
	
	
//	public Employee() {
//		
//	}
	
	public Employee(String name, int paymentPerhour) {
		this.name = name;
		this.paymentPerhour = paymentPerhour;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerhour() {
		return paymentPerhour;
	}
	public void setPaymentPerhour(int paymentPerhour) {
		this.paymentPerhour = paymentPerhour;
	}
	
	public abstract int calculateSalary();
	
	public void printInfo() {
		System.out.println("the name of the emplyee = " + this.getName() + 
				" the per hour rate is " + this.getPaymentPerhour());
	}
	
	public static void myStaticMethod() {
		
	}
	
}
