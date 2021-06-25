package task;

public class Machine {
	
	// Default access modifier which is package access gives access to the instances in the same package
//	String name = "Machine Type I";

	// it is giving access to this field to the same package and also the other packages that inherit this class
	protected String name = "Machine Type I";
	
	//public => means everywhere, everyone have access
	//protected => means ONLY the classes that inherit from the parent class
	//default (no access) => means ONLY the same package
	//private => means ONLY the same class can have access
	
	
	protected void start() {
		System.out.println("Machine Started");
	}
	
	public void stop() {
		System.out.println("Machine Stopped");
	}
	
}