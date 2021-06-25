package inheritance;

public class A extends B {
	
	public A(){
		super(30); // Super needs to be at the first line of the constructor
		int x = val;
		myMethod();
		
	}
	
	void doSomething() {
		myMethod();
//		super();
	}
}
