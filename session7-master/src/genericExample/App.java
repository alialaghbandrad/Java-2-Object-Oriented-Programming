package genericExample;

import java.util.ArrayList;
import java.util.List;

//Generic

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

class TestMultiple<T, U>{
	T obj1;
	U obj2;
	
	public TestMultiple(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public TestMultiple() {

	}
	
	public U getSecondType() {
		return obj2;
	}
}

class Person{
	String name;
	int telephon;
	
	
	Person(String name){
		this.name = name;
	}
}

public class App {
	
	public static void main(String[] argsss) {
		
		List<String> stringList = new ArrayList<String>();
		List<Integer> intlist = new ArrayList<Integer>();
		
		
		//bad 
//		List telList = new ArrayList();
//		telList.add("sdfa");
		
		
		Test<Integer> myTest1 = new Test<Integer>(15);
		Integer object = myTest1.getObject();
		
		System.out.println("the result is " + object);
		
		Test<String> myTest2 = new Test<String>("dummy phrase");
		String object2 = myTest2.getObject();
		
		System.out.println("the result is " + object2);

		//Generic class with multiple input
		TestMultiple<Integer, Person> myclass = new TestMultiple<Integer, Person>(12 , new Person("toto"));
		
		TestMultiple<Double, Person> myclass2 = new TestMultiple<Double, Person>();
		Person secondType = (Person)myclass2.getSecondType();
		
		
		TestMultiple<Double, Double> myclass3 = new TestMultiple<Double, Double>();
		
		TestMultiple myclass4 = new TestMultiple(12, 12);
//		Person badsecondType2 = (Person)myclass4.getSecondType(); //it throws classcast exception
		TestMultiple<Double, Person> myclass5 = new TestMultiple<Double, Person>();
		Person goodsecondType2 = myclass5.getSecondType(); //this one is perfect


	}
}
