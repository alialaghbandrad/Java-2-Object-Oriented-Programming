package rules;

class A{
	
}

class B extends A{
	
}


class Parent{
	
	final int variable  =20;
	
	Parent(){
		
	}
	
	private void m1() {
		System.out.println("From parent m1()");
	}
	
	protected void m2() {
		System.out.println("From parent m2()");

	}
	
	//having final prevents the child from overriding this method
	public final void m3() {
		System.out.println("From parent m3()");

	}
	
	
	static void m4() {
		System.out.println("From parent m4()");
	}
	
	
	public A m5() {
		return new A();
	}
}


// if you override a method, you need to have the same access modifier or less restrictive
class Child extends Parent{
	
	
	Child(){
		
	}

	//don't use private for overriding
	private void m1() {
		System.out.println("From child m2()");
	}
	
	public void m2() {
		System.out.println("From child m2()");
	}
	
	//don't use static for overriding
	static void m4() {
		System.out.println("From child m4()");

	}
	
	//either this method can return A or B[since B is a subclass of A]
	public B m5() {
		return new B();
	}
	
	//can I override a constructor?
	//you cannot override a constructor
}



public class Main {
	public static void main(String[] args) {
		Parent obj1 = new Child();
		
		//obj1.m1();
		
		
		//it calls the parent implementation
		//it is not necessary to remember this rull
		//it is called method hiding
		//don't use static because the child class implemntation will be hidden
		obj1.m4();
		
	}
}
