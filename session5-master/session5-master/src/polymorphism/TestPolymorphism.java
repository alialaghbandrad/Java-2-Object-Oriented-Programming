package polymorphism;

class Polymorphism {
	
	Polymorphism(){
		
	}
	
	Polymorphism(int a){
		
	}
	
	
	public void check() {
		System.out.println("every thing is fine");
	}
	
	public void check(int a) {
		System.out.println("every thing is fine with " + a);

	}
	
	public void check(int a, int b) {
		System.out.println("every thing is fine with " + a + " and  " + b);

	}
	
	public void check(String a) {
		System.out.println("every thing is fine with " + a );
	}
	
}

class Child extends Polymorphism{
	
	//it is a runtime polymorphism since it is overriding method of the parent
	public void check(int a) {
		System.out.println("child is being called " + a);
	}
	
	public void mySpecialPower() {
		
	}
}

public class TestPolymorphism{
	
	public static void main(String[] ars) {
		Polymorphism poly = new Polymorphism();	
		poly.check(12);
		
		
		Polymorphism poly2 = new Polymorphism();
		//at runtime it calls the parent
		poly2.check(30);	
		
		Polymorphism poly3 = new Child();
		poly3.check(50);
		
		poly3.check();
		
		poly3.check(10);
		
		//poly3.mySpecialPower(); => it is not possible
		
		
		
		
	}
}

