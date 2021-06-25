package collectionexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Employee{
	String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
	
}
public class App {
	
	public static void main(String[] args) {
		
		//List<Integer> listOfInteger = new ArrayList<Integer>();
		ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
		
		listOfInteger.add(1);
		listOfInteger.add(2);
		listOfInteger.add(3);
		listOfInteger.add(4);
		listOfInteger.add(5);
		listOfInteger.add(5);
		listOfInteger.add(null);

		//Array
//		int[] listofInts = new int[] {1,2,3,4,5};
//		for (int i=0; i< listofInts.length; i++) {
//			System.out.print(listofInts[i]);
//		}
		
		//basic way
		for(int i = 0; i< listOfInteger.size(); i++) {
			System.out.print(listOfInteger.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("using foreach");
		
		for(Integer number : listOfInteger) {
			System.out.print(number + " ");
		}
		
		System.out.println();
		System.out.println("using Lambda for each");
		
		//Java 8 foreach and Lambda with stream
		listOfInteger.forEach(element -> System.out.print(element + " "));
		
		listOfInteger.add(3, 77777);
		System.out.println();
		System.out.println("after insertion");
		listOfInteger.forEach(element -> System.out.print(element + " "));


//		listOfInteger.clear();
		
		if (listOfInteger.contains(77777)) {
			System.out.println("yehhh data exist");
		}
		
		
		Integer integer = listOfInteger.get(2);//gets value by index
		
		
		ArrayList<Employee> emplList = new ArrayList<Employee>();
		emplList.add(new Employee("A"));
		emplList.add(new Employee("B"));
		emplList.add(new Employee("C"));
		emplList.add(new Employee("D"));
		emplList.add(new Employee("D"));

		
		for(Employee emp : emplList) {
			System.out.println(emp);
		}
		System.out.println("with lambda");
		emplList.forEach(emp -> System.out.println(emp));
		
		
		//conversion of array to arrayList
		String[] strArray = {"Python", "C#", "Java"};
		List<String> listStr = new ArrayList<String>();
		
		for (String element: strArray) {
			listStr.add(element);
		}
		
		List<String> asList = java.util.Arrays.asList(strArray);
		
	}
}
