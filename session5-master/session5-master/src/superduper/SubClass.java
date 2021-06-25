package superduper;

public class SubClass extends SuperClass {
	
	public SubClass() {
		super(5);
		//this(); => you cannot have super and this in the same constructor
		
		System.out.println("something");
				
	}
	
	//overloaded
	public SubClass(int x) {
		
		//it means I am calling constructor without parameter=> SubClass() 
		this();
	}
	
	private void myMethod() {
		super.printSomething();
	}
}
