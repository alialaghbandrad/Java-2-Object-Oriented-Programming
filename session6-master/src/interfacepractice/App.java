package interfacepractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Animal{
	
	public void eat() {
		
	}
	
}

class SafariAnimal{
	public void sound() {
		
	}
}


interface Info{
	public abstract void showInfo1();
	
//	public void showInfo2();
//	
//	void showInfo3();
}

class Person implements Info{
	private String name;
	
	
	
	public Person(String name) {
		this.name = name;
	}



	@Override
	public void showInfo1() {
		System.out.println("Person name is = " + name);
	}
	
}

class Machine implements Info{

	private int id = 7;
	
	@Override
	public void showInfo1() {
		System.out.println("the machine id  = " + id);
		
	}
	
}


public class App {
	
	
	public static void main(String[] args) {
		Machine mach1 = new Machine();	
		Person person1 = new Person("Joe");	
		
		//make an instance of interface
		
		Info info1 = mach1;
		Info info2 = new Machine();
		
		info1.showInfo1();
		info2.showInfo1();
		
		
		Info info3 = person1;
		info3.showInfo1();
		
		
		
		//we don't use arrays !!!!
		Person[] persons = new Person[] {new Person("A"), new Person("B")};
 		
		// Generic, collections
		List<Person> listOfPersons = new ArrayList<>();
	
		
		//to add into the collection
		listOfPersons.add(new Person("A"));
		listOfPersons.add(new Person("B"));
		
		//get to take the person
		Person person = listOfPersons.get(0);
		
		
		
		
		
		List<Person> listofperson2 = new LinkedList<>();
		
		
	}
	
	

}

















