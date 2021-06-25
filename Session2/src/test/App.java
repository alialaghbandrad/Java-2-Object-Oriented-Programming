package test;

import association.City;
import association.Province;
import banking.Bank;
import banking.RbcBank;
import banking.SbiBank;

final class MyOwnImmutableClass{
	
	private int nas;
	
	private MyOwnImmutableClass() {
		
	}
	
//	public void setNas() {
//		
//	}
}

class ClassScopeExample{
	
	//it is accessible within the class
	private Integer amount = 0;
	
	private void exampleMethod() {
		amount++;
	}
	
	public void anotherExample() {
		int X = amount  + 4;
		
	}
	
	
	private void methodA() {
		int area = 2;
	}
	private void methodB() {
		//compile error
		//area is within the method scope
//		area = area + 2;
		
		for (int i =0 ; i< 10 ; i++) {
			
		}
		
		//it has loop access
//		System.out.println(i);
	}
	
	
}




class Person{
	String name;
}

class Test{
	
	public void TestCallByValue() {
		int x = 5;
		System.out.println("the value of X = " + x);
		myMethod1(x);
		System.out.println("the value of X = " + x);
		
		//Always pass by value
		//but the behavior of object passing and primitive are different
			
		Person p = new Person();
		p.name = "Joe";
		System.out.println("the value of name = " + p.name);

		myMethod2(p);
		System.out.println("the value of name = " + p.name);
		
		String str = "nonchanged";
		System.out.println("the value of name = " + str);
		myMethod3(str);
		System.out.println("the value of name = " + str);

		
		//Integer is not primitive
		//Integer is a wrapper class.
		
		//String are immutable
		String name = "Reza";
		name.replace("R", "G");
		System.out.println("the value of name = " + name);

		System.out.println("the value of name = " + str);
		String changed = str.concat("hello");
		
		//StringBuilder is the better way to work with String.
		
		//final variable
		final int val = 20;
//		val = 30; => it cannot be changed
		
		
	}
	
	
	public void myMethod3(String str) {
		str = "changed";
	}
	
	//Accepts the object
	public void myMethod2(Person p) {
		p.name = "Alex";
	}
	
	//Accepts the primitive
	//it makes a copy of the value you passed to it in the stack
	public void myMethod1(int x) {
		x = 20;
	}
}



class Car{
	
	int speed;
	
	Owner owner;
	
	public Car(Owner owner) {
		this.owner =owner;
	}
	
	boolean oilChanged(Car obj) {
		int x = this.speed;

		return true;
	}
	//this needs to be called here

	void tempMethod() {
		oilChanged(this);
	}
}


class Owner{
	String name;
	String address;
	
	public Owner() {
		Car car = new Car(this);
	}
}





public class App {

	public static void main(String[] args) {
		//Call by value or call by reference
		
		Test t = new Test();
		t.TestCallByValue();
		
//		Car car = new Car();
//		car.tempMethod();
		
		Owner owner = new Owner();
		
		
//		//Calling the abstract class and its children
//		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alex", 30);
////		fullTimeEmployee.setName("Reza");
//		System.out.println("the salary of FullTimeEmployee = "  + fullTimeEmployee.calculateSalary());
//		fullTimeEmployee.printInfo();	
//		
//		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Joe", 35, 5);
//		System.out.println("the salary of PartTimeEmployee = "  + partTimeEmployee.calculateSalary());
//		partTimeEmployee.printInfo();
//		
	
		
//		//The abstract class can not be instantiated
//		//Employee emp = new Employee();
//		
//		//Upcast and downcast
//		Employee emp1 = new FullTimeEmployee("Teo", 20);
//		
//		//polymorphism
//		Employee emp2 = new PartTimeEmployee("Teo", 20, 5);
//		//I don't have access to the methods of PartTimeEmployee
//		//emp2.getWorkingHour();
		
//		Bank b;
		Bank b = new RbcBank();
		System.out.println("the interest rate for rbc = " + b.getInterestRate() );
		
		b = new SbiBank();
		System.out.println("the interest rate for sbi = " + b.getInterestRate() );
		
		
		Province province1 = new Province();
		province1.setProvinceName("QC");
		
		City city1 = new City("Montreal");
		City city2 = new City("Longueuil");
		
		City[] cities = new City[] {city1, city2};
		province1.setCities(cities);
		
		
		TestConstructor testConstructor = new TestConstructor(5);
		int x = testConstructor.getValue();
		
		//I cannot change the value
		//testConstructor.value = -90;
	}


}
