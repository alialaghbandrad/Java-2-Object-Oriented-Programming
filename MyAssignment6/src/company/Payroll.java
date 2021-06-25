package company;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Payroll() {
	}
	
	public Payroll(List<Employee>  emplList) {
		this.employees = emplList;
	}
	
	public void paySalary() {
		for(Employee emp : employees) {
			System.out.println("the salary of " + emp + "equals = " + emp.salary());
		}
	}
}
