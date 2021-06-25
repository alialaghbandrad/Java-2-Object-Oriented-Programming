package illegaldefinition;

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		setSalary(salary);
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
		else {
			throw new IllegalArgumentException("the salary needs to be more than 0");
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}

public class App {
	public static void main(String[] args) {
		
		
		try {
			Employee emp1=new Employee("A", 20000);
			System.out.println(emp1);	
			
			Employee emp2=new Employee("B", -6);	
			System.out.println(emp2);

		}
		catch(IllegalArgumentException exc) {
			System.out.println(exc.getMessage());
		}
		
		
		
		
		
		
		
		
	}
}
