package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.score == o.score) {
			return 0;
		}
		else if (score < o.score) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if (salary >= 0.0) {
			this.salary = salary;
		}
		this.salary = 0.0;
	}


	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class App {

	public static void main(String[] args) {
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("B", 1000);
		listEmployee.add(emp1);
		
		listEmployee.add(new Employee("A", 4000));
		listEmployee.add(new Employee("D", 2000));
		listEmployee.add(new Employee("C", 6000));

		
		for(Employee emp : listEmployee) {
			System.out.println(emp);
		}
		
		//To sort the data and then send the data
		Collections.sort(listEmployee);
		
		System.out.println("after sort");
		
		
		for(Employee emp : listEmployee) {
			System.out.println(emp);
		}
		
		
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(new Student("TOTO", 6));
		studentList.add(new Student("POPO", 1));
		studentList.add(new Student("JOJO", 8));
		studentList.add(new Student("COCO", 4));


		studentList.forEach(std -> System.out.println(std));
		
		Collections.sort(studentList);
		System.out.println("after sort");
		studentList.forEach(std -> System.out.println(std));

		
		
 
	}

}
