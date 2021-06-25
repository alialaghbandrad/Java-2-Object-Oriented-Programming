package test;


// Abstraction and inheritance
public class FullTimeEmployee extends Employee {
	//???? where is the getPaymentPerhour ???
	
	
	//since the parent class does not have the default constructor
	//the children have to implement the constructor with paramter
	//of the parent
	public FullTimeEmployee(String name, int paymentPerhour) {
		super(name, paymentPerhour);
	}

	@Override //Annotation
	public int calculateSalary() {
		//I added this comment
		//for calculation
		return getPaymentPerhour() * 8;
	}

//	public void test() {
//		printInfo();
//	}
}
